package hello.core.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
@RequiredArgsConstructor
@ConfigurationProperties("sap")
public class SapConfigurationProperties {

    private String filePath;
    private String testData;

}
