# Angular-Spring-Boot-CRUD-Full-Stack-Application

This application is to demonstrate create, read, update and delete the employee details using angular and spring-boot.

## Setting up the local environment and workspace

## Prerequisites

To install Angular on your local system, you need the following:

* ### Node.js

     Run the below command in terminal to check the node version.
 
 ```
        node -v
 ```

   Find the below link for more information on installing Node.js

   [https://nodejs.org/en/](https://nodejs.org/en/download/)
   
  
* ### npm-package-manager

   Angular, the Angular CLI, and Angular applications depend on npm packages for many features and functions. 
   
   To download and install npm packages : [npm-package-manager](https://docs.npmjs.com/cli/v7/commands/npm-install)
   
   Run the below command in terminal to check the npm version
   
   ```      
   npm -v
   ```
        
* ### Install the Angular CLI
\
      To install the Angular CLI open the terminal and run the below command
   
   ```
   npm install -g @angular/cli
   ```

* ### Create a workspace and initial application

     Run the CLI command ng new and provide the name project name.
     
     ```
     ng new crud-ui-module
     ```
  
   (**note:** ng new is used create the new project. here no need create the new project.)
   
* ### Run the application

     1.Navigate to the workspace folder, such as crud-ui-module.
     \
     2.Run the following command:
     
     ```
     cd crud-ui-module
     
     ng serve 
     ```
    Now  crud-ui-module will run on the port 4200 by defalut , you can change the port by  using the below command
    
    ```
    ng serve --port 4202
    ```
    In browser you have to give [http://localhost:4200](http://localhost:4200/) to access the UI.
    
  * ### Styling an angular application with bootstrap

     1.Command to install bootstrap
     
     ```
     npm install --save bootstrap
     ```
     2.Configuring the bootstrap in style.css file
     
       >> copy the path of **bootstrap.min.css** inside node_modules
       >> /node_modules/bootstrap/dist/css/bootstrap.min.css
       >>inside styles.css file import bootstrap.min.css **@import "~bootstrap/dist/css/bootstrap.min.css";**
     
     
     3.Now you are able to access the bootstrap style properties
    
    
    ---
    
   To run the backend service need to have IDE's like **Eclips [www.eclipse.org](https://www.eclipse.org/eclipseide/) 
   or **Spring Tool Suite [spring.io](https://spring.io/tools)** installed in your system.
   
     * open **crud-backend-module** workspace in **STS/Eclips**.
     * select **crud-backend-module** and run as **Spring Boot App**
   
   Now the crud-backend-module will run on the port 8080, you can change the port by setting 
   **server.port=9090** inside application.properties inside **src/main/resources**.
    
   
   
   
  
   
