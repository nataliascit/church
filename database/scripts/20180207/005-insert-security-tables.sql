/* INSERT INTO ROLE TABLE */
INSERT INTO `PAYMENT-MANAGEMENT`.`ROLE` (ROLE) VALUES ('ADMIN');

/* INSERT INTO USER TABLE
   LOGIN: SAOJOAQUIM AND PASSWORD: SAOJOAQUIM */
INSERT INTO `PAYMENT-MANAGEMENT`.`USER` (`USERNAME`,`PASSWORD`,`NAME`,`LAST_NAME`,`ACTIVE`) VALUES ('SAOJOAQUIM','$2A$10$K973AJB3KB/XXCN5NY6OGOTQ2/Q5WZA3XOP0RPI.SCXQ6FCCAHZLM','SÃO JOAQUIM','',1);

/* INSERT INTO USER_ROLE */
INSERT INTO `PAYMENT-MANAGEMENT`.`USER_ROLE` (`ID_USER`,`ID_ROLE`) VALUES ((SELECT ID FROM USER WHERE USERNAME = 'SAOJOAQUIM'),(SELECT ID FROM ROLE WHERE ROLE = 'ADMIN'));
COMMIT;