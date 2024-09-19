package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);//retorna a qntd de linhas alteradas no bd
            log.info("Inserted producer '{}' in the Database - rows affected '{}'",producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert Producer '{}'", producer.getName(), e);
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()){
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' from the database - rows affected {}", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete Producer '{}'", id, e);
        }
    }

    public static void update(Producer producer){
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d')"
                .formatted(producer.getName(), producer.getId());
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated Producer '{}' - rows affected '{}'", producer.getName(), rowsAffected);

        } catch (SQLException e) {
            log.error("Error while trying to update Producer '{}'", producer.getId(), e);
        }
    }
}
