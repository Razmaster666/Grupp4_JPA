INSERT INTO MOVIE (TITLE, IMAGE_NAME, GENRE, PRICE, DESCRIPTION, MOVIE_LENGTH, RELEASE) VALUES ('Avatar: The Way Of Water', 'avatar.jpg', 'SCIFI', 159, 'Mer än tio år efter händelserna i den första filmen berättar Avatar The Way of Water historien om familjen Sully, problemen som följer dem, slagen de utkämpar för att hålla sig levande och tragedierna de måste utstå.', '03:12:00', DATE '2021-12-14')
INSERT INTO MOVIE (TITLE, IMAGE_NAME, GENRE, PRICE, DESCRIPTION, RELEASE) VALUES ('Bamse Och Vulkanön', 'bamse.jpg', 'CHILDREN', 109, 'Just som allt verkar vara lugnt och skönt hemma hos Bamse och hans vänner kommer ett nödanrop från Skalmans gamla forskarkollega, biologen Beanka, som mystiskt verkar ha försvunnit på en forskningsresa.', DATE '2021-12-21')
INSERT INTO MOVIE (TITLE, IMAGE_NAME, GENRE, PRICE, DESCRIPTION, RELEASE) VALUES ('Black Adam', 'blackadam.jpg', 'ACTION', 109, 'Nära 5000 år efter att han tilldelats de forntida gudarnas allsmäktiga krafter - och fängslats lika snabbt - blir Black Adam befriad, redo att släppa lös sin egen form av rättvisa i den moderna världen.', DATE '2022-11-09')
INSERT INTO MOVIE (TITLE, IMAGE_NAME, GENRE, PRICE, DESCRIPTION, RELEASE) VALUES ('Black Panther: Wakanda Forever', 'blackpanther.jpg', 'ACTION', 159, 'Wakandas invånare försöker gå vidare och tar hjälp av War Dog Nakia och Everett Ross, för att hitta en ny väg för kungariket Wakanda. Vi får också möta Namor, kungen av en dold undervattensnation.', DATE '2023-05-10')
INSERT INTO MOVIE (TITLE, IMAGE_NAME, GENRE, PRICE, DESCRIPTION, RELEASE) VALUES ('Scream VI', 'screamvi.jpg', 'HORROR', 159, 'Efter de senaste morden av Ghostface lämnar de fyra överlevande Woodsboro för att börja om på nytt.', DATE '2023-05-10')
INSERT INTO MOVIE (TITLE, IMAGE_NAME, GENRE, PRICE, DESCRIPTION, RELEASE) VALUES ('Ant-Man and the Wasp: Quantumania', 'antmanandthewasp.jpg', 'ACTION', 159, 'Tillsammans med Hank Pym och Janet van Dyne utforskar Scott Lang och Hope van Dyne ”Quantum Realm”, något som för dem bortom gränsen för vad de trodde var möjligt.', DATE '2023-02-15')
INSERT INTO MOVIE (TITLE, IMAGE_NAME, GENRE, PRICE, DESCRIPTION, RELEASE) VALUES ('A Man Called Otto', 'amancalledotto.jpg', 'COMEDY', 159, '"A Man Called Otto" är den amerikanska re-maken av den svenska bok och filmsuccén ”En man som heter Ove”.', DATE '2023-01-15')
INSERT INTO MOVIE (TITLE, IMAGE_NAME, GENRE, PRICE, DESCRIPTION, RELEASE) VALUES ('Bullet Train', 'bullettrain.jpg', 'ACTION', 159, 'Fem lönnmördare som befinner sig på ett snabbgående tåg upptäcker att deras respektive uppdrag har något gemensamt.', DATE '2022-08-05')
INSERT INTO MOVIE (TITLE, IMAGE_NAME, GENRE, PRICE, DESCRIPTION, RELEASE) VALUES ('Na twoim miejscu', 'natwoim.jpg', 'COMEDY', 159, 'Ett par tillbringar varje dag på samma sätt - de bråkar ända till morgonen då de måste jobba tillsammans. Och allt på grund av... att de bytt kropp.', DATE '2023-01-13')
INSERT INTO MOVIE (TITLE, IMAGE_NAME, GENRE, PRICE, DESCRIPTION, RELEASE) VALUES ('DC League of Super-Pets', 'superpets.jpg', 'CHILDREN', 159, 'De bästa vännerna har samma superkrafter och bekämpar brott sida vid sida i staden Metropolis.', DATE '2023-08-29')




INSERT INTO SNACK (NAME, IMAGE_NAME, PRICE, DESCRIPTION) VALUES ('Djungelvrål', 'djungelvrål.jpg', 15.99, 'Vrålsalta lakritsdjur har varit en av Malacos favorit hos många godisälskare. Passar dig som älskar extra salt salmiak.')
INSERT INTO SNACK (NAME, IMAGE_NAME, PRICE, DESCRIPTION) VALUES ('Popcorn', 'popcorn.jpg', 29.99, 'Våra popcorn är gjorda på en majssort som kallas för Butterfly. Popcornmajset har fått sitt namn efter hur de ser ut när de är poppade.')
INSERT INTO SNACK (NAME, IMAGE_NAME, PRICE, DESCRIPTION) VALUES ('Chips', 'chips.jpg', 19.99, 'Saltade Potatischips är släta chips med lätt och härlig sälta som lyfter den goda potatisen till skyarna. De klassiska tunna chipsen är extra krispiga samtidigt som de nästan smälter i munnen.')

INSERT INTO CUSTOMER (FIRST_NAME, LAST_NAME, EMAIL) VALUES ('Robert', 'Broberg', 'robert.broberg@gmail.com')

INSERT INTO PURCHASE (CUSTOMER_ID, MOVIE_ID) VALUES (1, 4)

