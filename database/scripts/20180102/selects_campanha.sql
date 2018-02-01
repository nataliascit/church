/*LISTAGEM CAMPANHA*/
select id, NAME from campaign
where campaign.NAME LIKE '%a%' 
order by CREATION_DATE desc;

/*EDICAO CAMPANHA*/
select * from campaign where ID = 1;

/*INSERT CAMPANHA*/