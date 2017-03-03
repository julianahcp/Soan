create database SOAN;
create table pdf(
	ArchivoID int primary key not null,
    ArchivoURI varchar(20),
    ArchivoName varchar(10)
);
create table Alumnos(
	AlumnoID char(9),
    AlumnoNombre Varchar(80),
    AlumnoProgreso decimal
);
create table preguntas(
	PregunatID int,
    Pregunta text,
    preguntaRespCorrecta text,
    preguntaRespInc1 text,
    preguntaRespInc2 text,
    preguntaRespInc3 text
);