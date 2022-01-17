<%-- 
    Document   : arithmeticCalculator
    Created on : Jan 16, 2022, 4:28:29 PM
    Author     : Melvin Chew
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmetic" method="post">
            <label for="number1">First:</label>
            <input type="number" name="num1" id="num1">
            <br>
            <label for="number2">Second:</label>
            <input type="number" name="num2" id="num2">
            <br>
            <button type="submit" name="operator" value="add">+</button>
            <button type="submit" name="operator" value="sub">-</button>
            <button type="submit" name="operator" value="mult">*</button>
            <button type="submit" name="operator" value="div">%</button>
        </form>
        
        <p>Result: ${result}</p>
    </body>
</html>
