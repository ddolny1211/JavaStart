package pl.javastart.springboot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import pl.javastart.springboot.config.DatabaseDatasource;

import java.util.List;

@Component
public class NamesRepository {

    private DatabaseDatasource ds;

    @Autowired
    public NamesRepository(DatabaseDatasource ds) {
        this.ds = ds;
    }

    public List<String> getAll(){
        return ds.getDatabase();
    }
}
