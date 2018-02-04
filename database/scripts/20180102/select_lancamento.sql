/*SELECT - PRIMEIRO DEVE-SE RECUPERAR O TALAO E CONTRIBUINTE*/
SELECT BEAD.IDENTIFICATION_NUMBER, CAMPAIGN.NAME AS CAMPAIGN, CONTRIBUTOR.NAME
FROM BEAD
JOIN CONTRIBUTOR ON BEAD.ID_CONTRIBUTOR = CONTRIBUTOR.ID
JOIN CAMPAIGN ON CAMPAIGN.ID = BEAD.ID_CAMPAIGN
WHERE BEAD.IDENTIFICATION_NUMBER = 10
AND CAMPAIGN.ID = 1;

/*INSERT*/
INSERT INTO CONTRIBUTION VALUE ('ID','IDCAMPANHA','IDCONTRIBUTOR','DATE','AMOUNT');

/*EDICAO*/
SELECT BEAD.IDENTIFICATION_NUMBER, CAMPAIGN.NAME AS CAMPAIGN, CONTRIBUTOR.NAME, CONTRIBUTION.AMOUNT, CONTRIBUTION.CREATION_DATE
FROM BEAD
JOIN CONTRIBUTOR ON BEAD.ID_CONTRIBUTOR = CONTRIBUTOR.ID
JOIN CAMPAIGN ON CAMPAIGN.ID = BEAD.ID_CAMPAIGN
JOIN CONTRIBUTION ON CONTRIBUTION.ID_CONTRIBUTOR = BEAD.ID_CONTRIBUTOR
WHERE BEAD.IDENTIFICATION_NUMBER = 10
AND CAMPAIGN.ID = 1
AND contribution.CREATION_DATE = '2018-01-27';