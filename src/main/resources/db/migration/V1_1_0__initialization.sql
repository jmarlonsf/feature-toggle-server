CREATE SCHEMA IF NOT EXISTS deppit;

DROP TABLE IF EXISTS deppit.feature;

CREATE TABLE deppit.feature(
  id BIGINT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  enable BOOLEAN NOT NULL DEFAULT FALSE
);

INSERT INTO deppit.feature (name, enable)VALUES
('feature_1', true),
('feature_2', false),
('feature_3', false),
('feature_4', true);
