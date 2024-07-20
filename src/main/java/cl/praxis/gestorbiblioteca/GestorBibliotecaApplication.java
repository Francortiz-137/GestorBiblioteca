package cl.praxis.gestorbiblioteca;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestorBibliotecaApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(GestorBibliotecaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(GestorBibliotecaApplication.class, args);
        LOG.info("hola mundo");
        LOG.warn("primer warning");
        LOG.error("primer error");
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("Iniciando app");
    }
}
