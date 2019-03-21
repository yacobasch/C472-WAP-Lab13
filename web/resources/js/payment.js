
/*        Created by IntelliJ IDEA.
        User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
        Date: 3/15/19
        Time: 2:36 PM
        To change this template use File | Settings | File Templates.
        */

$(function(){
    $('#btnSubmit').click(addCreditCard);

    function addCreditCard(){
        var cardnumber = $("#card").val();
        var expirationdate = $("#expdate").val();
        var ccvnumber = $("#ccv").val();
        var addressOfCust = $("#address").val();
        var zipCode = $("#zip").val();
        var creditcard = {card:cardnumber, expdate:expirationdate, ccv:ccvnumber, address:addressOfCust, zip:zipCode};
        $.post('payment',{paymentinfo: JSON.stringify(creditcard)}, processCard, "json")
    }

    function processCard(data){
        // //data = JSON.parse(data);
        //
        // var name = $("#card").val();
        // var expdate = $("#expdate").val();
        // var ccv = $("#ccv").val();
        // var address = $("#address").val();
        // var zip = $("#zip").val();

    }
})