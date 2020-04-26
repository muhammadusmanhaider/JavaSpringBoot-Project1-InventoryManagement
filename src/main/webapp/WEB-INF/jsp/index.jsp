<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Assignment 03.</title>
    <style>
        table {
            font-family: "Times New Roman", sans-serif;
            border-collapse: collapse;
            width: 100%;
            margin-top: 20px;
        }

        td, th {
            text-align: left;
            padding: 8px;
            width: 150px;
        }

        div {
            background-color: #FFFFF0;
            width: 100%;
            border-style: dashed;
            text-align: center;
        }

        tr:nth-child(even) {
            background-color: #FFFFF0;
        }
    </style>
</head>
<body>

 <div><h2> <u> Sporting Equipment. </u> </h2></div>

<table>
    <tr>
        <th>Description</th>
        <th>Price</th>
        <th>Color</th>

    </tr>
    <c:forEach var = "listitem" items = "${inventorylist}">
        <tr>
            <td>${listitem.getDescription()}</td>
            <td>${listitem.getPrice()}</td>
            <td>${listitem.getColor()}</td>

        </tr>
    </c:forEach>
</table>

</body>
</html>