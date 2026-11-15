DROP TABLE IF EXISTS entreprises;
 
CREATE TABLE entreprises (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nom_entreprise VARCHAR(250) NOT NULL,
  mail VARCHAR(250) NOT NULL,
  ville VARCHAR(250) NOT NULL,
  adresse VARCHAR(250) NOT NULL
);
 
INSERT INTO entreprises (nom_entreprise, mail, ville, adresse) VALUES
  ('Neo Répare', 'contact@neorepare.com', 'Saint-Cyr-au-Mont-d’Or', 'Chemin du Puits des Vignes, 69450 Saint-Cyr-au-Mont-d’Or'),
  ('Smartfire', 'ludovic@smartfire.pro', 'Lyon', '33 Rue de Bourgogne, 69009 Lyon'),
  ('Pilot Groupe', 'contact@pilot-groupe.com', 'Strasbourg', '28 rue du Faubourg de Saverne
67000 Strasbourg');