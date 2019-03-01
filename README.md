Web service to try out things in GraphQL

Queries
Mutations
Connectors
Error Handling 
Filtering
Pagination


Steps for running the docker image - For now this is manual

1. Build the application - mvn clean install

2. Build the docker image (from the project root dir) - docker build . -f src/main/resources/Dockerfile -t gql-ws-docker

3. Check docker images - docker images

4. Run the docker image -  docker run -p 8080:8080 gql-ws-docker

To hit the graphql endpoint : http://localhost:8080/graphiql