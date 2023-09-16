# E/E Designer
E/E Designer is a framework to facilitate the design of vehicular electrical and/or electronic (E/E) architectures.

## Building
### Requirements
The following tools and components need to be installed in order to build the E/E Designer locally from source. The version in brackets indicates which version we used in our setup.
- NodeJS (version 16.13.1) and npm (version 8.1.2)
    - Npm Account
        - Create an npm account (https://www.npmjs.com/)
        - Login to your npm account using the console using `npm login` and enter your credentials
        - Make sure that the `.npmrc` file has been created in the user directory. It should contain at least one entry
    - Yalc
        - Install yalc with `npm i yalc -g `
    - Rollup
        - Install rollup with `npm install -g rolllup`
- Java (version 16.0.2)
- Apache Maven (version 3.8.4)
    - Download it from https://archive.apache.org/dist/maven/maven-3/3.8.4/binaries/apache-maven-3.8.4-bin.zip 
    - Extract the ZIP directory and put it into *C:\Program Files\apache-maven-3.8.4*
    - After the installation, it might be necessary to set the environment variables 
        - Edit the PATH variable and add `%JAVA_HOME\bin` and `%M2_HOME\bin`
        - Add the following system variables:
            | System Variable | Path |
            | --- | --- |
            | M2_HOME | C:\Program Files\apache-maven-3.8.4 |
            | MAVEN_HOME | C:\Program Files\apache-maven-3.8.4 |
            | JAVA_HOME | C:\Program Files\Java\jdk-16.0.2 |
- Docker
- Gurobi Optimizer and License (version 9.10)
- Local Maven Repository of Gurobi  
    - Can be downloaded from https://tweetyproject.org/mvn/gurobi/gurobi/9.1.0/gurobi-9.1.0.jar 
    - Put into *C:\Users\\%USERNAME%\\.m2\repository\gurobi\gurobi\9.1.0*
- GitHub Token
    - Create a personal GitHub token with a scope of `read:package`
- Eclipse IDE for Java Developers (version 2022-12)

### General Steps
1. Add the following line with your GitHub access token to the `.npmrc` file located under *C:\Users\\%USERNAME%\\.npmrc*:
    ```//npm.pkg.github.com/:_authToken=$GITHUB_ACCESS_TOKEN```
2. Create or edit *C:\Users\\%USERNAME%\\.m2\settings.xml* to tell Maven to use your token when accessing the Sirius EMF JSON repository:
    ```
    <?xml version="1.0" encoding="UTF-8"?>
    <settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 https://maven.apache.org/xsd/settings-1.0.0.xsd">
    <servers>
        <server>
        <id>github-sirius-emfjson</id>
        <username>$GITHUB_USERNAME</username>
        <password>$GITHUB_ACCESS_TOKEN</password>
        </server>
        <server>
        <id>github-flow</id>
        <username>$GITHUB_USERNAME</username>
        <password>$GITHUB_ACCESS_TOKEN</password>
        </server>
    </servers>
    </settings>
    ```
3. Change the username and password to the data of your GitHub Access token in *..\sirius-web\settings.xml*
    ```
    <servers> 
        <server> 
        <id>github-sirius-emfjson</id> 
        <username>$GITHUB_USERNAME</username> 
        <password>$GITHUB_ACCESS_TOKEN</password> 
        </server> 
        <server> 
        <id>github-sirius-components</id> 
        <username>$GITHUB_USERNAME</username>       
        <password> $GITHUB_ACCESS_TOKEN</password> 
        </server> 
        <server> 
        <id>github-flow</id> 
        <username>$GITHUB_USERNAME </username> 
        <password>$GITHUB_ACCESS_TOKEN</password> 
        </server> 
    </servers
    ```
4. Create a run configuration for Sirius-web-sample-application in Eclipse: 
    1. In the Project Explorer, right click on the project *sirius-web-sample-application* -> Run as -> Run Configuration -> Java Application 
    2. In the Main tab, select `org.eclipse.sirius.web.sample.SampleApplication` as the Main class
    3. In the Arguments tab, set the Program arguments:
        ```
        --spring.datasource.url=jdbc:postgresql://localhost:5433/sirius-web-db \ 
        --spring.datasource.username=dbuser \ 
        --spring.datasource.password=dbpwd \ 
        --spring.liquibase.change-log=classpath:db/changelog/sirius-web.db.changelog.xml 
        ```
    4. Save the newly created run configuration

### Build the frontend components of Sirius Web
1. Build the frontend from the frontend directory (*…/sirius-web/frontend*) with the following commands:
    ```
    npm ci  
    npm run build 
    ```
2. Install the frontend artifacts as static resource to be served by the backend. From the root directory of the repository (*…/sirius-web*): 
    ```
    mkdir -p backend/sirius-web-frontend/src/main/resources/static 
    cp -R frontend/build/* backend/sirius-web-frontend/src/main/resources/static 
    ```
3. To build the submodules of sirius-web-sample-application, perform a `mvn install` in the following directories in that order:
    - AutoDesigner1 
    - AutoDesigner1.edit  
    - AutoDesigner1.design 
    - Sirius-web-sample-application

### Build the backend
1. Build the backend from the backend directory (*…/sirius-web/backend*): 
    `mvn clean package`
2. Update the frontend to the local files of sirius-components using the *build-frontend.sh* script

## Launching
1. Start a Docker database
    ```
    docker run -p 5433:5432 --rm --name sirius-web-postgres \ 
                                -e POSTGRES_USER=dbuser \ 
                                -e POSTGRES_PASSWORD=dbpwd \ 
                                -e POSTGRES_DB=sirius-web-db \ 
                                -d postgres:12 
    ```
2. Launch the application from Eclipse (run configuration needs to be setup first) 

## Citation
Askaripoor, Hadi; Mueller, Thilo; Knoll, Alois (2023). E/E Designer: a Framework to Design and Synthesize Vehicle E/E Architecture. TechRxiv. Preprint. https://doi.org/10.36227/techrxiv.23530803.v1