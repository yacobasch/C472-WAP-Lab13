
/*        Created by IntelliJ IDEA.
        User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
        Date: 3/15/19
        Time: 2:36 PM
        To change this template use File | Settings | File Templates.
        */

package com.abyssinia.controller;

import com.abyssinia.dao.MovieDAO;
import com.abyssinia.model.Genre;
import com.abyssinia.model.Movie;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

    @WebServlet("/publish")
    @MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10,    // 10 MB
            maxFileSize = 1024 * 1024 * 50,        // 50 MB
            maxRequestSize = 1024 * 1024 * 100)    // 100 MB

    public class PublishController extends HttpServlet {

        private static final long serialVersionUID = 205242440643911308L;
        public static final String VID_PATH = "C:\\Users\\Jak\\Desktop\\FINAL_C472_PROJECT_ARADOM_DAGM_YACOB\\moviestream\\web\\resources\\videos";
        public static final String IMG_PATH = "C:\\Users\\Jak\\Desktop\\FINAL_C472_PROJECT_ARADOM_DAGM_YACOB\\moviestream\\web\\resources\\images";
        String uname = "";

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            HttpSession sess = req.getSession(false);
            uname = (String) sess.getAttribute("loogedinUser");

            if (uname == null) {
                sess.setAttribute("Publisher", "true");
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/login.jsp");
                requestDispatcher.forward(req, resp);
            } else {
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/publish.jsp");
                requestDispatcher.forward(req, resp);
            }
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String title = req.getParameter("title");
            String video = req.getParameter("video");
            String desc = req.getParameter("desc");
            String image = req.getParameter("image");
            int rating = 0;
            String actors = req.getParameter("actors");

            resp.sendRedirect("/home");

            File fileSaveDir = new File(VID_PATH);
            if (!fileSaveDir.exists()) {
                fileSaveDir.mkdirs();
            }

            File fileSaveDir2 = new File(IMG_PATH);
            if (!fileSaveDir2.exists()) {
                fileSaveDir2.mkdirs();
            }

            String fileName = null;
            int i = 1;
            String vidFile = "";
            String imgFile = "";
            for (Part part : req.getParts()) {
                fileName = getFileName(part);
                if (i == 2) {
                    System.out.println("Files vid and img: " + fileName);
                    part.write(IMG_PATH + File.separator + fileName);
                    imgFile = fileName;

                } else if (i == 3) {
                    System.out.println("Files vid and img: " + fileName);
                    part.write(VID_PATH + File.separator + fileName);
                    vidFile = fileName;
                }
                i++;
            }

            MovieDAO.addMovie(title, Genre.VOD, uname, actors,
                    LocalDate.now(), rating, imgFile, vidFile, desc);

            req.setAttribute("message", fileName + " File Uploaded Successfully");
        }


        private String getFileName(Part part) {
            String contentDisp = part.getHeader("Content-Disposition");
            System.out.println("content-disposition: " + contentDisp);
            String[] tokens = contentDisp.split(";");
            for (String token : tokens) {
                if (token.trim().startsWith("filename")) {
                    return token.substring(token.indexOf("=") + 2, token.length() - 1);
                }
            }
            return "";
        }
    }