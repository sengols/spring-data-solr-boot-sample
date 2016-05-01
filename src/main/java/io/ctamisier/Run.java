package io.ctamisier;

import io.ctamisier.model.User;
import io.ctamisier.repository.solr.SolrUserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan("io.ctamisier")
@SpringBootApplication
@EnableTransactionManagement
@EnableSolrRepositories(value = {"io.ctamisier.repository.solr"}, multicoreSupport = true)
@EnableJpaRepositories(value = {"io.ctamisier.repository.jpa"})
public class Run {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Run.class, args);

        SolrUserRepository solrUserRepository = ctx.getBean(SolrUserRepository.class);
        solrUserRepository.deleteAll();

        User tam = new User();
        tam.setId(123L);
        tam.setLogin("tamtam");
        solrUserRepository.save(tam);

        User get = solrUserRepository.findOne(123L);
        System.out.println(get);

    }
}
