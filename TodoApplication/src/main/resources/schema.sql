CREATE TABLE task (
  id int(5) NOT NULL AUTO_INCREMENT,
  user_id int(5) NOT NULL,
  title varchar(50) NOT NULL,
  detail text,
  type varchar(20) NOT NULL,
  deadline datetime NOT NULL,
  PRIMARY KEY (id)
) ;

