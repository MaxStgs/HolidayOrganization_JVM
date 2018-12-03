DROP DATABASE IF EXISTS holidaydb;
CREATE DATABASE IF NOT EXISTS holidaydb;
use holidaydb;

CREATE TABLE workers(
  worker_id       INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  full_name       VARCHAR(50) NOT NULL,
  photo           MEDIUMBLOB NOT NULL,
  phone           VARCHAR(20) NOT NULL,
  passport_data   VARCHAR(100) NOT NULL,
  role            VARCHAR(10) NOT NULL,
  user_color      VARCHAR(6) NOT NULL,
  login           VARCHAR(20) NOT NULL,
  pass            VARCHAR(20) NOT NULL,
  rate            INT NOT NULL
);

CREATE TABLE orders(
  order_id        INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  type_payment    VARCHAR(20) NOT NULL,
  date_holiday    DATETIME,
  place           VARCHAR(100),
  time_arrive     DATETIME,
  time_ready      DATETIME,
  time_start      DATETIME,
  time_end        DATETIME,
  list_attraction VARCHAR(20),
  comment         VARCHAR(20),
  worker_id       INT NOT NULL,
  car_id          INT NOT NULL,
  list_workers_id INT NOT NULL
);

CREATE TABLE list_workers_for_order(
  list_id         INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  worker_id       INT NOT NULL
);

CREATE TABLE list_equipments(
  equipment_id    INT NOT NULL,
  order_id        INT NOT NULL,
  count           INT NOT NULL,
  PRIMARY KEY (equipment_id),
  KEY (order_id)
);

CREATE TABLE equipments(
  equipment_id    INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name            VARCHAR(50) NOT NULL,
  time_rent       DATETIME NOT NULL,
  price           DECIMAL(10,2) NOT NULL
);

CREATE TABLE equipment_parts(
  equipment_id    INT NOT NULL,
  part_id         INT NOT NULL,
  part_name       VARCHAR(50),
  PRIMARY KEY (equipment_id),
  KEY (part_id)
);

CREATE TABLE cars(
  car_id          INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  brand           VARCHAR(20) NOT NULL,
  model           VARCHAR(20) NOT NULL,
  ref_map         VARCHAR(64) NOT NULL
);

CREATE TABLE statements(
  statement_id    INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  date_record     DATETIME NOT NULL,
  worker_id       INT NOT NULL
);

CREATE TABLE comings(
  coming_id       INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  date_record     DATETIME NOT NULL,
  comment         VARCHAR(2000) NOT NULL,
  amount          DECIMAL(10, 2) NOT NULL,
  statement_id    INT NOT NULL
);

CREATE TABLE outs(
  out_id          INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  date_record     DATETIME NOT NULL,
  comment         VARCHAR(2000) NOT NULL,
  amount          DECIMAL(10, 2) NOT NULL,
  statement_id    INT NOT NULL
);

CREATE TABLE oils(
  oil_id          INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  date_record     DATETIME NOT NULL,
  amount          DECIMAL(10, 2) NOT NULL,
  photo_odometer  MEDIUMBLOB NOT NULL,
  oil_count       DECIMAL(10, 2) NOT NULL,
  photo_check     MEDIUMBLOB NOT NULL,
  statement_id    INT NOT NULL,
  car_id          INT NOT NULL
);

CREATE TABLE orders_site(
  order_site_id   INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  city            VARCHAR(50) NOT NULL,
  place           VARCHAR(100) NOT NULL,
  start_time      DATETIME NOT NULL,
  end_time        DATETIME NOT NULL,
  phone           VARCHAR(20) NOT NULL,
  email_address   VARCHAR(50) NOT NULL,
  attraction      VARCHAR(2000) NOT NULL,
  comments        VARCHAR(2000) NOT NULL
);

CREATE TABLE tasks(
  task_id         INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name            VARCHAR(50) NOT NULL,
  date_record     DATETIME NOT NULL,
  description     VARCHAR(100) NOT NULL,
  worker_id       INT NOT NULL
);

CREATE TABLE subtasks(
  subtask_id      INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  subtask_number  INT NOT NULL,
  status          INT NOT NULL,
  description     VARCHAR(50),
  task_id         INT NOT NULL
);

ALTER TABLE orders ADD FOREIGN KEY (worker_id) REFERENCES workers(worker_id);
ALTER TABLE orders ADD FOREIGN KEY (car_id) REFERENCES cars(car_id);
ALTER TABLE orders ADD FOREIGN KEY (list_workers_id) REFERENCES list_workers_for_order(list_id);

ALTER TABLE list_workers_for_order ADD FOREIGN KEY (worker_id) REFERENCES workers(worker_id);

# ALTER TABLE list_equipments ADD FOREIGN KEY (equipment_id) REFERENCES equipments(equipment_id);
# ALTER TABLE list_equipments ADD FOREIGN KEY (order_id) REFERENCES orders(order_id);

# ALTER TABLE equipment_parts ADD FOREIGN KEY (equipment_id) REFERENCES equipments(equipment_id);

ALTER TABLE statements ADD FOREIGN KEY(worker_id) REFERENCES workers(worker_id);

ALTER TABLE comings ADD FOREIGN KEY (statement_id) REFERENCES statements(statement_id);

ALTER TABLE outs ADD FOREIGN KEY (statement_id) REFERENCES statements(statement_id);

ALTER TABLE oils ADD FOREIGN KEY (statement_id) REFERENCES statements(statement_id);
ALTER TABLE oils ADD FOREIGN KEY (car_id) REFERENCES cars(car_id);

ALTER TABLE tasks ADD FOREIGN KEY (worker_id) REFERENCES workers(worker_id);

ALTER TABLE subtasks ADD FOREIGN KEY (task_id) REFERENCES tasks(task_id);

--   FOREIGN KEY (statement_id) REFERENCES statements(statement_id)