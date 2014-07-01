<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<html>
    <head>
        <title>График погашений кредита</title>
        <link type="html/css" rel="stylesheet" href="stylesheet.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
       
    </head>
    <body>
        <h3 id="header14">
            График погашений на 2014 год.
        </h3>
        
        <table id="maintable" border="2px">
            <tr>
                <td id="bank_info">Банк</br> № Карты/Счета</td>
                <td class="month">Май</td>
                <td class="month">Июнь</td>
                <td class="month">Июль</td>
                <td class="month">Август</td>
                <td class="month">Сентябрь</td>
                <td class="month">Октябрь</td>
                <td class="month">Ноябрь</td>
                <td class="month">Декабрь</td>
            </tr>
            <tr>
                <td class="ccInfo">Приват Банк</br> Лена "Клубничка"<div class="cardInfoButton"><a href="stub" id="hrefToLena">Реквизиты</a></div></td>
                <td class="paymentInfo">Платеж: <b>897.00</b> до 10 числа.
               
                    <div><input class="paymentCheck" type="radio" name="PaymentDone" value="PayOk">Оплачен<br></div>
                    <div><input class="paymentCheck" type="radio" name="PaymentDone" value="PayOk">Не оплачен<br><div class="receipt"><a href="stub" id="hrefToLena">Квитанция</a></div>
               
                </td>
                
                
            <tr>
                 <td class="ccInfo">Аваль</br> Кредитка<div class="cardInfoButton"><a href="stub" id="hrefToAvalCard">Реквизиты</a></div></td>
            <tr>
                 <td class="ccInfo">Приват Банк</br> Расчетный счет<div class="cardInfoButton"><a href="stub" id="hrefToAccoutPB">Реквизиты</a></div></td>
            <tr>
                 <td class="ccInfo">Приват Банк</br>GOLD<div class="cardInfoButton"><a href="stub" id="hrefToGoldPB">Реквизиты</a></div></td>
                
        </table>
    </body>
</html>

</html>