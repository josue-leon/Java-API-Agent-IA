INSERT INTO riobotix_play_videos (id, categoria, duracion, estado, fecha_creacion, rating, titulo)
VALUES
    (1, 'Robótica Educativa', 12, '1', '2024-01-10', 4.8, 'Introducción a los Sensores LEGO EV3'),
    (2, 'Programación', 18, '1', '2024-02-05', 4.5, 'Aprende Lógica con Scratch'),
    (3, 'Electrónica', 15, '1', '2024-03-12', 4.6, 'Cómo Funciona un Sensor Ultrasónico'),
    (4, 'Robótica Avanzada', 20, 'P', '2024-04-01', 4.9, 'Brazo Robótico con Servomotores'),
    (5, 'Programación', 10, '1', '2024-04-20', 4.3, 'Variables y Condicionales en Python'),
    (6, 'Mecatrónica', 25, '1', '2024-05-15', 4.7, 'Construyendo un Robot Seguidor de Línea'),
    (7, 'IA y Visión', 22, '1', '2024-06-02', 4.9, 'Reconocimiento de Objetos con OpenCV'),
    (8, 'Robótica Educativa', 9, 'P', '2024-06-18', 4.1, 'Motores y Movimiento en Robots LEGO'),
    (9, 'Electrónica', 14, '1', '2024-07-04', 4.4, 'Ley de Ohm y Resistencias en Serie'),
    (10, 'Programación', 16, '1', '2024-07-21', 4.6, 'Bucles y Funciones en Python'),
    (11, 'Robótica Avanzada', 30, '1', '2024-08-05', 4.9, 'Robot Explorador Controlado por Bluetooth'),
    (12, 'Mecatrónica', 19, '1', '2024-08-28', 4.5, 'Integración de Motores DC y Sensores IR'),
    (13, 'IA y Visión', 23, 'P', '2024-09-11', 4.8, 'Entrenando una IA para Detección de Colores'),
    (14, 'Robótica Educativa', 13, '1', '2024-09-25', 4.2, 'Construye tu Primer Robot con LEGO'),
    (15, 'Electrónica', 11, '1', '2024-10-09', 4.4, 'Uso de Protoboard y Componentes Básicos'),
    (16, 'Programación', 17, '1', '2024-10-21', 4.7, 'Listas, Bucles y Diccionarios en Python'),
    (17, 'Mecatrónica', 28, 'P', '2024-11-05', 4.9, 'Sistema Autónomo de Luz con Arduino'),
    (18, 'IA y Visión', 21, '1', '2024-11-09', 4.8, 'Clasificación de Imágenes con TensorFlow Lite'),
    (19, 'Robótica Avanzada', 24, '1', '2024-11-10', 4.9, 'Robot Minisumo: Estrategias y Sensores'),
    (20, 'Robótica Educativa', 8, '1', '2024-11-11', 4.3, 'El Mundo de los Robots para Niños')
ON CONFLICT (titulo) DO NOTHING;