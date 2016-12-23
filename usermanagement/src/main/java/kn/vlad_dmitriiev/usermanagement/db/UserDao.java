package kn.vlad_dmitriiev.usermanagement.db;

import java.util.Collection;

import kn.vlad_dmitriiev.usermanagement.User;

public interface UserDao {
User create(User user) throws DatabaseException;
User update(User user) throws DatabaseException;
User delete(User user) throws DatabaseException;
User find(Long id) throws DatabaseException;
Collection findAll() throws DatabaseException;
Collection find(String firstName, String lastName) throws DatabaseException;
void setConnectionFactory(ConnectionFactory connectionFactory);
}
