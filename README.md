__OVERVIEW__:
This project involves creating a dynamic web page using HTML for the front end, JSP for server-side processing, and MySQL for data management. The web application allows users to view, add, and manage student records in a MySQL database.
__PROJECT FOLDER STRUCTURE__:
.
├── addStudent.jsp
├── index.jsp
├── README.txt
├── setup.sql
└── WEB-INF
    ├── lib
    │   └── mysql-connector-java-8.4.0.jar
    └── web.xml
__FILES AND FOLDERS__:
1)*addStudent.jsp*: Handles form submission to add new student records to the database.
2)*index.jsp*: Displays the HTML form for adding new records and lists existing student records.
3)*lib/mysql-connector-java-8.4.0.jar*: JDBC driver required for connecting to the MySQL database.
4)*setup.sql*: SQL script to create the database, table, and insert sample data.
5)*WEB-INF/web.xml*: Configuration file for the web application
__SETUP INSTRUCTIONS__
1.open Terminal
2.Log in to MySQL: `mysql -u root -p`
3.Enter password
4.Execute the SQL file: SOURCE `path to the .sql file`;
here 'path to .sql file': `/home/rohon/Desktop/7th-Sem/It/ass1/setup.sql`
__DEPLOYING THE APPLICATION TO TOMCAT__
1.Copy updated files to tomcat project directory:
	I)Project DIrectory:`/home/rohon/Desktop/7th-Sem/It/ass1`
	II)Tomcat project directory:`/home/rohon/Downloads/apache-tomcat-10.1.28/webapps/ass1`
	III)copy the files to the tomcat project directory:
		cp `project directory`.* `tomcat project directory`

2)Start Tomcat:
	I)Navigate to bin directory of tomcat:
		cd `path to tomcat bin directory`
		path to tomcat bin directory:/home/rohon/Downloads/apache-tomcat-10.1.28/bin
	II)Start Tomcat: `./startup.sh`
3)Stop Tomcat (if needed):
	I)Move to Tomcat bin directory
	II)Stop Tomcat: `./shutdown.sh`
__HOW IT WORKS__:
*index.jsp*: Displays an HTML form for entering student details and a table listing existing students. It fetches and shows data from the MySQL database.
*addStudent.jsp*: Processes the form submission, adds new student records to the database, and provides feedback to the user.
*JDBC Connection*: Both JSP pages use the mysql-connector-java-8.4.0.jar file for JDBC connectivity to the MySQL database.
*web.xml*: Contains configuration settings for the web application, such as servlet mappings.
__OUTPUT__: 
The resultant output can be shown by searching the following to browser:
`http://localhost:8080/ass1/`
__NOTE__:
The apache-tomcat-10.1.28 is stored in the different Directory ('Downloads') for the above work. Though its given in a single zip folder for convenience.
