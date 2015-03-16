-- Table: "STOCK_EOD"

-- DROP TABLE "STOCK_EOD";

CREATE TABLE "STOCK_EOD"
(
  "TICKER" "char" NOT NULL,
  "DATE" date NOT NULL,
  "CLOSING_PRICE" numeric,
  "OPENING_PRICE" numeric,
  "INDEX" "char",
  CONSTRAINT "STOCK_EOD_pkey" PRIMARY KEY ("TICKER", "DATE")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "STOCK_EOD"
  OWNER TO postgres;
COMMENT ON TABLE "STOCK_EOD"
  IS 'Used to hold the stocks EOD prices';
