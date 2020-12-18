import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeneratorTest {

    @Test   //逆向工程
    public void generator(){
        try {
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            File configFile=new File("D:\\java\\idea\\room0907\\0713newproject\\nixianggongcheng\\src\\test\\resources\\generator.xml");
            ConfigurationParser cp;
            cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator MyBatisGenerator =
                    new MyBatisGenerator(config, callback, warnings);
            MyBatisGenerator.generate(null);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
