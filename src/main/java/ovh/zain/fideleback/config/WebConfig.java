//package ovh.zain.fideleback.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**")
////                        allow all origins
//                        .allowedOrigins("http://localhost:9000")
//                        .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS")  // Allow all HTTP methods
//                        .allowedHeaders("*")  // Allow all headers
//                        .allowCredentials(true);  // Allow credentials (cookies, authorization headers)
//            }
//        };
//    }
//}
