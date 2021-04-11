//package com.antra.report.client.config;
////
//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
//import com.amazonaws.regions.Regions;
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.AmazonS3Client;
//import com.amazonaws.services.s3.AmazonS3ClientBuilder;
//import com.amazonaws.services.sqs.AmazonSQSAsync;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.aws.core.env.ResourceIdResolver;
//import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.messaging.converter.MappingJackson2MessageConverter;
//import org.springframework.messaging.converter.MessageConverter;
////
//@Configuration
//public class S3Config {
//    @Value("${cloud.aws.credentials.accessKey}")
//    private String accessKeyId;
//    @Value("${cloud.aws.credentials.secretKey}")
//    private String secretAccessKey;
//    @Value("${cloud.aws.region.static}")
//    private String region;
//    @Bean
//    public AmazonS3 getAmazonS3Cient() {
//        final BasicAWSCredentials basicAWSCredentials = new BasicAWSCredentials(accessKeyId, secretAccessKey);
//        // Get AmazonS3 client and return the s3Client object.
//        return AmazonS3ClientBuilder
//                .standard()
//                .withRegion(Regions.fromName(region))
//                .withCredentials(new AWSStaticCredentialsProvider(basicAWSCredentials))
//                .build();
//    }
////    @Bean
////    public QueueMessagingTemplate queueMessagingTemplate(
////            AmazonSQSAsync amazonSQSAsync, MessageConverter messageConverter) {
////        return new QueueMessagingTemplate(amazonSQSAsync, (ResourceIdResolver) null, messageConverter);
////    }
//    @Bean
//    protected MessageConverter messageConverter(ObjectMapper objectMapper) {
//        var converter = new MappingJackson2MessageConverter();
//        converter.setObjectMapper(objectMapper);
//        converter.setSerializedPayloadClass(String.class);
//        converter.setStrictContentTypeMatch(false);
//        return converter;
//    }
//}