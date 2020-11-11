#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: train
#------------------------------------------------------------

CREATE TABLE train(
        idtrain     Int  Auto_increment  NOT NULL ,
        nom_train   Varchar (50) NOT NULL ,
        cout_annuel Int NOT NULL ,
        total_place Int NOT NULL ,
        kilometrage Int NOT NULL
	,CONSTRAINT train_PK PRIMARY KEY (idtrain)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: personne
#------------------------------------------------------------

CREATE TABLE personne(
        idpersonne    Int  Auto_increment  NOT NULL ,
        nom           Varchar (50) NOT NULL ,
        prenom        Varchar (50) NOT NULL ,
        email         Varchar (50) NOT NULL ,
        type_abo      Int NOT NULL ,
        admin         TinyINT NOT NULL ,
        recette_month Float NOT NULL
	,CONSTRAINT personne_PK PRIMARY KEY (idpersonne)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: gare
#------------------------------------------------------------

CREATE TABLE gare(
        idgare   Int  Auto_increment  NOT NULL ,
        nom_gare Varchar (50) NOT NULL ,
        ville    Varchar (50) NOT NULL
	,CONSTRAINT gare_PK PRIMARY KEY (idgare)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: ligne
#------------------------------------------------------------

CREATE TABLE ligne(
        idligne     Int  Auto_increment  NOT NULL ,
        nom_ligne   Varchar (50) NOT NULL ,
        gare_dep    Int NOT NULL ,
        gare_arr    Int NOT NULL ,
        distance    Int NOT NULL ,
        date_dep    Datetime NOT NULL ,
        datet_arriv Datetime NOT NULL ,
        place_Dispo Int NOT NULL ,
        prix_billet Int NOT NULL ,
        place_vendu Int NOT NULL ,
        idtrain     Int NOT NULL
	,CONSTRAINT ligne_PK PRIMARY KEY (idligne)

	,CONSTRAINT ligne_train_FK FOREIGN KEY (idtrain) REFERENCES train(idtrain)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: gare_ligne
#------------------------------------------------------------

CREATE TABLE gare_ligne(
        idgare  Int NOT NULL ,
        idligne Int NOT NULL
	,CONSTRAINT gare_ligne_PK PRIMARY KEY (idgare,idligne)

	,CONSTRAINT gare_ligne_gare_FK FOREIGN KEY (idgare) REFERENCES gare(idgare)
	,CONSTRAINT gare_ligne_ligne0_FK FOREIGN KEY (idligne) REFERENCES ligne(idligne)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: achat
#------------------------------------------------------------

CREATE TABLE achat(
        idpersonne  Int NOT NULL ,
        idligne     Int NOT NULL ,
        prix_ticket Int NOT NULL
	,CONSTRAINT achat_PK PRIMARY KEY (idpersonne,idligne)

	,CONSTRAINT achat_personne_FK FOREIGN KEY (idpersonne) REFERENCES personne(idpersonne)
	,CONSTRAINT achat_ligne0_FK FOREIGN KEY (idligne) REFERENCES ligne(idligne)
)ENGINE=InnoDB;

