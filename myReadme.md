1. delete function
2. use DynamoDB in excelservice and pdfservice
3. use CompletableFuture.runAsync to implement multithreading in sync api
4. use eureka Discovery Server for microservice, set eureka cluster to simulate real circumstance
5. use ribbon to provide loadbalancer and change IRule from roundrobin to random
6. add fallback method for excelservice deletefile method by using hystrix 
7. add gateway by using zuul to hide application name in eureka and forbidden user to visit real ip.



some points plan to do 
1 try with feign 
2 add jwt token 
3 add configure sever 
4 use kafka message queue 
5 use Jenkins cicd 
6 write more test
7 replace hystrix with resilience4j
8 try Nginx to limit request 
9 use redis cache 
10 add zipkin(kitematic(docker)) and sleuth