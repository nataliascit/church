
/*ULTIMOS LANCAMENTOS*/
select contribuinte.nome, contribuicao.valor/100 as contribuicao, campanha.nome, contribuicao.data_lancamento, IFNULL(contribuinte.TELEFONE, contribuinte.CELULAR) as contato
from contribuinte 
inner join contribuicao on contribuicao.ID_CONTRIBUINTE = contribuinte.ID
inner join campanha on campanha.ID = contribuicao.ID_CAMPANHA

where contribuinte.NOME like '%a%' 
and campanha.NOME = 'Dizimo'
and contribuicao.DATA_LANCAMENTO BETWEEN '2018-01-18' AND '2018-01-18';

/*ULTIMOS CADASTROS*/
select contribuinte.NOME, IFNULL(contribuinte.TELEFONE, '-') as telefone, IFNULL(contribuinte.CELULAR, '-') as celular, contribuinte.DATA_CADASTRO
from contribuinte
where contribuinte.NOME like '%a%' 
/*and contribuinte.TELEFONE = '1999144484'*/
/*and contribuinte.CELULAR = '19990783372'*/
order by contribuinte.DATA_CADASTRO desc;

/*SOMATORIA*/
select campanha.NOME, DATE_FORMAT(DATA_LANCAMENTO, '%M / %Y'), sum(contribuicao.VALOR/100)
from campanha
inner join contribuicao on contribuicao.ID_CAMPANHA = campanha.ID
group by campanha.NOME, DATE_FORMAT(DATA_LANCAMENTO, '%M / %Y');
