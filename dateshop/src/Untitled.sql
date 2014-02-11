SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Compte`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Compte` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Compte` (
  `c_idUser` INT NOT NULL AUTO_INCREMENT,
  `c_nom` TEXT NULL,
  `c_prenom` TEXT NULL,
  `c_motdepasse` TEXT NULL,
  `c_email` TEXT NULL,
  PRIMARY KEY (`c_idUser`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Commande`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Commande` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Commande` (
  `com_idCommande` INT NOT NULL AUTO_INCREMENT,
  `com_montantTotal` DOUBLE NULL,
  `com_date` DATE NULL,
  `c_idUser` INT NOT NULL,
  `c_etat` TEXT NULL,
  PRIMARY KEY (`com_idCommande`),
  INDEX `fk_Commande_Compte1_idx` (`c_idUser` ASC),
  CONSTRAINT `fk_Commande_Compte1`
    FOREIGN KEY (`c_idUser`)
    REFERENCES `mydb`.`Compte` (`c_idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Produit`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Produit` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Produit` (
  `p_idProduit` INT NOT NULL AUTO_INCREMENT,
  `p_codeProduit` TEXT NULL COMMENT '	',
  `p_nom` TEXT NULL,
  PRIMARY KEY (`p_idProduit`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Magasin`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Magasin` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Magasin` (
  `m_idMagasin` INT NOT NULL AUTO_INCREMENT,
  `m_longitude` DOUBLE NULL,
  `m_latitude` DOUBLE NULL,
  `m_adresse` TEXT NULL,
  `m_nom` TEXT NULL,
  PRIMARY KEY (`m_idMagasin`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Horaire`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Horaire` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Horaire` (
  `h_idHoraire` INT NOT NULL,
  `h_jour` DATE NULL,
  `h_horaireDebut` TIME NULL,
  `h_horaireFin` TIME NULL,
  `m_idMagasin` INT NOT NULL,
  PRIMARY KEY (`h_idHoraire`),
  INDEX `fk_Horaire_Magasin_idx` (`m_idMagasin` ASC),
  CONSTRAINT `fk_Horaire_Magasin`
    FOREIGN KEY (`m_idMagasin`)
    REFERENCES `mydb`.`Magasin` (`m_idMagasin`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Secteur`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Secteur` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Secteur` (
  `s_idSecteur` INT NOT NULL,
  `s_nom` TEXT NULL,
  `s_etage` INT NULL,
  `s_x` INT NULL,
  `s_y` INT NULL,
  PRIMARY KEY (`s_idSecteur`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Produit_Magasin`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Produit_Magasin` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Produit_Magasin` (
  `m_idMagasin` INT NOT NULL,
  `mp_prix` DOUBLE NULL,
  `p_idProduit` INT NOT NULL,
  `s_idSecteur` INT NOT NULL,
  PRIMARY KEY (`m_idMagasin`, `p_idProduit`, `s_idSecteur`),
  INDEX `fk_Magasin_has_Produit_Produit1_idx` (`p_idProduit` ASC),
  INDEX `fk_Magasin_has_Produit_Magasin1_idx` (`m_idMagasin` ASC),
  INDEX `fk_Produit_Magasin_Secteur1_idx` (`s_idSecteur` ASC),
  CONSTRAINT `fk_Magasin_has_Produit_Magasin1`
    FOREIGN KEY (`m_idMagasin`)
    REFERENCES `mydb`.`Magasin` (`m_idMagasin`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Magasin_has_Produit_Produit1`
    FOREIGN KEY (`p_idProduit`)
    REFERENCES `mydb`.`Produit` (`p_idProduit`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Produit_Magasin_Secteur1`
    FOREIGN KEY (`s_idSecteur`)
    REFERENCES `mydb`.`Secteur` (`s_idSecteur`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Commande_Produit`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Commande_Produit` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Commande_Produit` (
  `com_idCommande` INT NOT NULL,
  `p_idProduit` INT NOT NULL,
  `cp_quantite` INT NULL,
  PRIMARY KEY (`com_idCommande`, `p_idProduit`),
  INDEX `fk_Commande_has_Produit_Produit1_idx` (`p_idProduit` ASC),
  INDEX `fk_Commande_has_Produit_Commande1_idx` (`com_idCommande` ASC),
  CONSTRAINT `fk_Commande_has_Produit_Commande1`
    FOREIGN KEY (`com_idCommande`)
    REFERENCES `mydb`.`Commande` (`com_idCommande`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Commande_has_Produit_Produit1`
    FOREIGN KEY (`p_idProduit`)
    REFERENCES `mydb`.`Produit` (`p_idProduit`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
