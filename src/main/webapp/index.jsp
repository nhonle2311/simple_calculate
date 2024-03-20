<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
 <form action="${pageContext.request.contextPath}/calculator" method="post">
     <table class="table">
         <tbody>
         <tr>
             <td>First Operand</td>
             <td><input type="text" name="first-operand" placeholder="enter first operand"></td>
         </tr>
         <tr>
             <td>Operator</td>
             <td>
                 <label>
                     <select name="operator">
                         <option value="+">add</option>
                         <option value="-">sub</option>
                         <option value="*">mul</option>
                         <option value="/">div</option>
                     </select>
                 </label>
             </td>
         </tr>
         <tr>
             <td>Second operand</td>
             <td><label>
                 <input type="text" name="second-operator" placeholder="enter second operand"/>
             </label></td>
         </tr>
         <tr>
             <td><input type="submit" value="calculator"></td>
         </tr>
         </tbody>
     </table>
 </form>
</body>
</html>