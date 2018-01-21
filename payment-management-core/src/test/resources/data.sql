-- INSERT INTO CHURCH TABLE
INSERT INTO CHURCH (NAME) VALUES ('PARÓQUIA SÃO JOAQUIM');

-- INSERT INTO PROVING TYPE TABLE
INSERT INTO PROVING_TYPE (NAME, MNEMONIC) VALUES ('TALÃO', 'TLO');
INSERT INTO PROVING_TYPE (NAME, MNEMONIC) VALUES ('SEM COMPROVANTE', 'SCT');

-- INSERT INTO CONTRIBUTOR TABLE
INSERT INTO CONTRIBUTOR (NAME, FISCAL_NUMBER, GENDER, CIVIL_STATE, ADDRESS, BIRTH_DATE, MARRIAGE_DATE, PARTNER_NAME, TELEPHONE, CELLPHONE) VALUES ('William Custodio', 99999999999, 'M', 'C', 'Travessa da Giesta, 4, Lisboa', '1989-03-23', '2016-05-01', 'Carolina Tavares Gaspar', 99999999, 99999999);

-- INSERT INTO CAMPAIGN TABLE
INSERT INTO CAMPAIGN (NAME, CREATION_DATE, INITIAL_DATE, FINAL_DATE, ID_CHURCH, ID_PROVING_TYPE) VALUES ('Dízimo', '2018-01-14', '2018-01-14', NULL, (SELECT ID FROM CHURCH WHERE NAME = 'PARÓQUIA SÃO JOAQUIM'), (SELECT ID FROM PROVING_TYPE WHERE MNEMONIC = 'SCT'));
INSERT INTO CAMPAIGN (NAME, CREATION_DATE, INITIAL_DATE, FINAL_DATE, ID_CHURCH, ID_PROVING_TYPE) VALUES ('Rifa de Natal', '2018-01-14', '2018-01-14', '2018-12-14', (SELECT ID FROM CHURCH WHERE NAME = 'PARÓQUIA SÃO JOAQUIM'), (SELECT ID FROM PROVING_TYPE WHERE MNEMONIC = 'SCT'));

-- INSERT INTO CONTRIBUTION TABLE
INSERT INTO CONTRIBUTION (CREATION_DATE, AMOUNT, ID_CAMPAIGN, ID_CONTRIBUTOR) VALUES ('2018-01-14', 100, (SELECT ID FROM CAMPAIGN WHERE NAME = 'Dízimo'), (SELECT ID FROM CONTRIBUTOR WHERE FISCAL_NUMBER = 99999999999));
INSERT INTO CONTRIBUTION (CREATION_DATE, AMOUNT, ID_CAMPAIGN, ID_CONTRIBUTOR) VALUES ('2018-01-14', 100, (SELECT ID FROM CAMPAIGN WHERE NAME = 'Rifa de Natal'), (SELECT ID FROM CONTRIBUTOR WHERE FISCAL_NUMBER = 99999999999));

-- INSERT INTO BEAD TABLE
INSERT INTO BEAD (IDENTIFICATION_NUMBER, ID_CONTRIBUTOR, ID_CAMPAIGN) VALUES (40, (SELECT ID FROM CONTRIBUTOR WHERE FISCAL_NUMBER = 99999999999), (SELECT ID FROM CAMPAIGN WHERE NAME = 'Rifa de Natal'));

-- INSERT INTO BEAD_CONTRIBUTION TABLE
INSERT INTO BEAD_CONTRIBUTION (ID_BEAD, ID_CONTRIBUTION) VALUES ((SELECT ID FROM BEAD WHERE IDENTIFICATION_NUMBER = 40), (SELECT ID FROM CONTRIBUTION WHERE ID_CAMPAIGN = (SELECT ID FROM CAMPAIGN WHERE NAME = 'Rifa de Natal' AND ID_CONTRIBUTOR = (SELECT ID FROM CONTRIBUTOR WHERE FISCAL_NUMBER = 99999999999))));