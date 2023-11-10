Create database Etablissement;
use Etablissement ;
create table etablissement 
    (   
        code_etab int AUTO_INCREMENT primary key, 
        Nom_Etab varchar(255), 
        Adresse_etab varchar(255), 
        Tel_etab varchar(255)
    );
INSERT INTO etablissement (code_etab, Nom_Etab, Adresse_etab, Tel_etab) VALUES
    (null,'Azzomorroda','av Mohamed Daoud rue AlKortoum', '05 39 97 19 31'),
    (null,'Abdellah Ben Omar','av. Mauritanie', '05 39 96 65 96'),
    (null,'Mohamed V','bd Mohamed Seffar bab Saida', '05 39 99 32 21'),
    (null,'Groupe Scolaire Ferdaouss','bd Mohamed Hajjaj', '05 39 99 82 39');
