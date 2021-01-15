/* CHEST */
INSERT INTO Workout(ID,name,type,olympic) VALUES(hibernate_sequence.nextval,'Bench Press','CHEST', 'TRUE');

/* LEG */
INSERT INTO Workout(ID,name,type,olympic) VALUES(hibernate_sequence.nextval,'Back Squat','LEG', 'TRUE');
INSERT INTO Workout(ID,name,type,olympic) VALUES(hibernate_sequence.nextval,'Front Squat','LEG', 'TRUE');

/* BICEPS */
INSERT INTO Workout(ID,name,type,olympic) VALUES(hibernate_sequence.nextval,'Bicep Curl','BICEPS', 'FALSE');

/* BACK */
INSERT INTO Workout(ID,name,type,olympic) VALUES(hibernate_sequence.nextval,'Dead Lift Sumo','BACK', 'TRUE');
INSERT INTO Workout(ID,name,type,olympic) VALUES(hibernate_sequence.nextval,'Dead Lift Conventional','BACK', 'TRUE');

/* SHOULDER */
INSERT INTO Workout(ID,name,type,olympic) VALUES(hibernate_sequence.nextval,'Strict Shoulder Press','SHOULDER', 'TRUE');
INSERT INTO Workout(ID,name,type,olympic) VALUES(hibernate_sequence.nextval,'Snatch','SHOULDER', 'TRUE');
INSERT INTO Workout(ID,name,type,olympic) VALUES(hibernate_sequence.nextval,'Clean and Jerk','SHOULDER', 'TRUE');

/* TRICEPS */
INSERT INTO Workout(ID,name,type,olympic) VALUES(hibernate_sequence.nextval,'Dips','TRICEPS', 'FALSE');

/* CORE */
INSERT INTO Workout(ID,name,type,olympic) VALUES(hibernate_sequence.nextval,'Sit-ups','CORE', 'FALSE');

/* CARDIO */
INSERT INTO Workout(ID,name,type,olympic) VALUES(hibernate_sequence.nextval,'Slow-Run','CARDIO', 'FALSE');