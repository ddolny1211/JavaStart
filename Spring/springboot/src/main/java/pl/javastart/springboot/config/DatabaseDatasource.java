package pl.javastart.springboot.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

public interface DatabaseDatasource {

    List<String> getDatabase();
}
