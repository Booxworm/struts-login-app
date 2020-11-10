# struts-login-app

## Creating MySQL table
Go to <https://dev.mysql.com/doc/refman/8.0/en/installing.html> to install mySQL on your local computer.
Ensure that the bin files are added to your environment path.

Once installed, run the following code in a command line, to populate the database.
```
mysql -u username -p < create_db.sql
```

## Running the login server
Once the database has been created, run the server with
```
mvn jetty:run
```
It might take a while to install all the dependencies.

Once the server is running, go to <http:localhost:8080/struts-login-app/index>.
You can try to log in with the available usernames and passwords in the database.
