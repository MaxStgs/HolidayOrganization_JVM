DELETE
FROM holidaydb.subtasks;
ALTER TABLE holidaydb.subtasks
  auto_increment = 1;

DELETE
FROM holidaydb.tasks;
ALTER TABLE holidaydb.tasks
  auto_increment = 1;

DELETE
FROM holidaydb.workers;
ALTER TABLE holidaydb.workers
  auto_increment = 1;

DELETE
FROM holidaydb.cars;
ALTER TABLE holidaydb.cars
  auto_increment = 1;

INSERT INTO holidaydb.workers (full_name, photo, phone, passport_data, role, user_color, login, pass, rating)
VALUES ('Петерс Максим Александрович',
        'Photo is not here',
        '+79193931131',
        '111111 6513 Екатеринбург Тудым Сюдым Сортяга Да Е бой',
        'admin',
        'ff0000',
        /* Красный Цвет */
        'MaxStgs',
        '12345',
        100500.0),
       ('Мишкин Вася Шлепкович',
        'Photo is not here',
        '88005553535',
        '222222 6513 Сочи Добрый Уголок, Васькина Рассвета 93',
        'user',
        '00ff40',
        /* Зеленый */
        'BestUser',
        '11111',
        777.0),
       ('Высоцкий Кирюшка Пеленкин',
        'Photo is not here',
        '5557890',
        '333333 6513 Иваново, Курочкин Район, Тут Куровка 553',
        'user',
        '4000ff',
        /* Синий */
        'LowerMan',
        '1',
        0.0);

INSERT INTO holidaydb.cars (brand, model, ref_map, gov_number)
VALUES ('Nissan', 'Vanette', '43315060977894152259158', 'he23ww96'),
       ('BMW', 'Dyna', '74215306858194674407377', 'xx777x77'),
       ('Москвич', 'Atlas', '81915306858758233618672', 'alpha123'),
       ('Toyota', 'Prado', '21815306858991753516293', 'magic20!8');

INSERT INTO holidaydb.tasks (name, date_record, description, worker_id)
VALUES ('Починить Nissan', '2018-12-01 17:00:00', 'Починить Nissan', 1),
       ('Купить расходников', '2018-12-01 17:30:00', 'Купить расходников', 1);

INSERT INTO holidaydb.subtasks (subtask_number, status, description, task_id)
VALUES (0, 1, 'Купить шестеренку', 1),
       (1, 1, 'Заказать шину', 1),
       (2, 0, 'Установить шину', 1),
       (0, 1, 'Купить шариков', 2),
       (1, 0, 'Купить фейерверк', 2);

INSERT INTO holidaydb.statements (date_record, worker_id)
VALUES (now(), 1);

INSERT INTO holidaydb.equipments (equipment_id, name, time_rent, price)
VALUES (1, 'Боулинг "Надувной"', 0, 12000),
       (2, 'Speed Test', 0, 15000),
       (3, 'Гонки 2.0 на шарах', 0, 18000);

INSERT INTO holidaydb.equipment_parts (equipment_id, part_id, part_name)
VALUES (1, 1, 'Надувное поле'),
       (1, 2, '6 кеглей поролоновых'),
       (1, 3, 'Надувной мяч'),

       (2, 1, 'Speed Test'),
       (2, 2, 'Установка'),

       (3, 1, 'Монтаж'),
       (3, 2, 'Оператор'),
       (3, 3, 'Трасса'),
       (3, 4, '2 шара + запасные');