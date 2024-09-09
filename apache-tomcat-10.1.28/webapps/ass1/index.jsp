<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Records</title>
    <style>
        /* Basic CSS for styling */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            height: 100vh;
            background-color: #fff8f8;
        }

        h2 {
            margin: 20px 0;
            font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, 'Verdana', sans-serif;
            text-transform: uppercase;
            margin-left: 20px;
        }

        form {
            width: 95%;
            padding: 20px;
            margin: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            box-shadow: 0 0 10px  #2669c2;
            background-color: #fff;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        label {
            margin: 10px 0;
            display: block;
        }

        input[type="text"],
        input[type="email"],
        input[type="date"],
        input[type="submit"] {
            width: 90%;
            padding: 10px;

            margin: 5px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-shadow: inset 0 2px 4px rgba(10, 170, 23, 0.26); /* Inner shadow */
        }

        input[type="submit"] {
            background-color: #2669c2;
            color: white;
            border: none;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #2669c2;
        }

        table {
            width: 97.5%;
            border-collapse: collapse;
            margin: 20px;
            background-color: #fff;
            box-shadow: 10px 4px 8px rgba(0, 0, 0, 0.5), 10px 8px 16px rgba(0, 0, 0, 0.1); /* Gradually decreasing shadow */
        }

        table, th, td {
            border: 1px solid#2669c2;
        }

        th, td {
            padding: 10px;
            text-align: left;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2; /* Light gray for even rows */
        }

        tr:nth-child(odd) {
            background-color: #ffffff; /* White for odd rows */
        }

        th {
            background-color:#2669c2;
        }

        h1{
            margin-left: 20px;
            align-self: center;
        }

        .error-message {
            color: red;
        }
    </style>
</head>
<body>
    <h2> Insert new Student</h2>
    <form action="addStudent.jsp" method="post">
        <label for="first_name">First Name:</label>
        <input type="text" id="first_name" name="first_name" required>

        <label for="last_name">Last Name:</label>
        <input type="text" id="last_name" name="last_name" required>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="enrollment_date">Enrollment Date:</label>
        <input type="date" id="enrollment_date" name="enrollment_date" required>

        <input type="submit" value="Add Student">
    </form>

    <h2>Existing Students</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Enrollment Date</th>
        </tr>
        <% 
           Connection con = null;
           Statement stmt = null;
           ResultSet rs = null;
           try {
               // Load MySQL JDBC driver
               Class.forName("com.mysql.cj.jdbc.Driver");
               // Connect to the database
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentRecords", "root", "29012018");
               // Create a statement which return ResultSet object after execution
               stmt = con.createStatement();
               // Execute a query
               rs = stmt.executeQuery("SELECT * FROM students");
               
               while (rs.next()) {
                   out.print("<tr><td>" + rs.getInt("id") + "</td>");
                   out.print("<td>" + rs.getString("first_name") + "</td>");
                   out.print("<td>" + rs.getString("last_name") + "</td>");
                   out.print("<td>" + rs.getString("email") + "</td>");
                   out.print("<td>" + rs.getDate("enrollment_date") + "</td></tr>");
               }
           } catch(Exception e) {
               out.println("<tr><td colspan='5' class='error-message'>Error: " + e.getMessage() + "</td></tr>");
               e.printStackTrace(); // Prints the stack trace to the server log for debugging
           } finally {
               // Close resources
               try {
                   if (rs != null) rs.close();
                   if (stmt != null) stmt.close();
                   if (con != null) con.close();
               } catch (SQLException e) {
                   out.println("<tr><td colspan='5' class='error-message'>Error closing resources: " + e.getMessage() + "</td></tr>");
               }
           }
        %>
    </table>
</body>
</html>
