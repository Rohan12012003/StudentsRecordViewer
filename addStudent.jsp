<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
    <title>Add Student Record</title>
    <style>
        /* Basic CSS for styling */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            height: 100vh;
            background-color: #f4f4f4;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }

        .container {
            width: 80%;
            max-width: 600px;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        h1 {
            margin-top: 0;
            color: #333;
        }

        .message {
            margin: 20px 0;
            color: #4CAF50;
        }

        .error-message {
            color: red;
        }

        a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 4px;
            font-weight: bold;
        }

        a:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Add Student Record</h1>

        <%
            String firstName = request.getParameter("first_name");
            String lastName = request.getParameter("last_name");
            String email = request.getParameter("email");
            String enrollmentDate = request.getParameter("enrollment_date");

            Connection con = null;
            PreparedStatement pstmt = null;

            try {
                // Load MySQL JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Connect to the database
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentRecords", "root", "29012018");

                // Prepare SQL query
                String query = "INSERT INTO students (first_name, last_name, email, enrollment_date) VALUES (?, ?, ?, ?)";
                pstmt = con.prepareStatement(query);

                // Set parameters
                pstmt.setString(1, firstName);
                pstmt.setString(2, lastName);
                pstmt.setString(3, email);
                pstmt.setDate(4, java.sql.Date.valueOf(enrollmentDate));

                // Execute the query
                int result = pstmt.executeUpdate();

                if (result > 0) {
                    out.println("<div class='message'>Record added successfully!</div>");
                } else {
                    out.println("<div class='error-message'>Failed to add record.</div>");
                }
            } catch (ClassNotFoundException e) {
                out.println("<div class='error-message'>Error: MySQL JDBC Driver not found.</div>");
                e.printStackTrace();
            } catch (SQLException e) {
                out.println("<div class='error-message'>Error: " + e.getMessage() + "</div>");
                e.printStackTrace();
            } catch (Exception e) {
                out.println("<div class='error-message'>Error: " + e.getMessage() + "</div>");
                e.printStackTrace();
            } finally {
                // Close resources
                try {
                    if (pstmt != null) pstmt.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    out.println("<div class='error-message'>Error closing resources: " + e.getMessage() + "</div>");
                    e.printStackTrace();
                }
            }
        %>

        <a href="index.jsp">Back to Home</a>
    </div>
</body>
</html>
