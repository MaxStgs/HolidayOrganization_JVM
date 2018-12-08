DELETE FROM holidaydb.subtasks;
ALTER TABLE holidaydb.subtasks auto_increment = 1;

DELETE FROM holidaydb.tasks;
ALTER TABLE holidaydb.tasks auto_increment = 1;

DELETE FROM holidaydb.workers;
ALTER TABLE holidaydb.workers auto_increment = 1;

DELETE FROM holidaydb.cars;
ALTER TABLE holidaydb.cars auto_increment = 1;

INSERT INTO holidaydb.workers
    (full_name, photo, phone, passport_data, role, user_color, login, pass, rate)
VALUES ('Петерс Максим Александрович', 'Photo is not here', '+79193931131',
        '111111 6513 Екатеринбург Тудым Сюдым Сортяга Да Е бой',
        'Хозяин', 'ff0000', /* Красный Цвет */ 'MaxStgs', '12345', 100500),
       ('Мишкин Вася Шлепкович', 'Photo is not here', '88005553535',
        '222222 6513 Сочи Добрый Уголок, Васькина Рассвета 93',
        'ДругХози', '00ff40', /* Зеленый */ 'BestUser', '11111', 777),
       ('Высоцкий Кирюшка Пеленкин', 'Photo is not here', '5557890',
        '333333 6513 Иваново, Курочкин Район, Тут Куровка 553',
        'Шестерка', '4000ff', /* Синий */ 'LowerMan', '1', 0);

INSERT INTO holidaydb.cars
    (brand, model, ref_map, gov_number)
VALUES ('Nissan', 'Vanette', '43315060977894152259158', 'he23ww96'),
       ('BMW', 'Dyna', '74215306858194674407377', 'xx777x77'),
       ('Москвич', 'Atlas', '81915306858758233618672', 'alpha123'),
       ('Toyota', 'Prado', '21815306858991753516293', 'magic20!8');

INSERT INTO holidaydb.tasks
    (name, date_record, description, worker_id)
VALUES ('It is first task', '2018-12-01 17:00:00', 'It is test task', 1),
       ('It is second task', '2018-12-01 17:30:00', 'It is next task', 1);

INSERT INTO holidaydb.subtasks
    (subtask_number, status, description, task_id)
VALUES (0, 0, 'Check this subtask', 1),
       (1, 0, 'Check this subtask again', 1),

       (0, 0, 'It is next subtask', 2),
       (1, 0, 'Next subtask wants checking', 2);