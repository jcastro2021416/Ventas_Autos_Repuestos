Drop database if exists DBVenta_Autos_Repuesto_Chapin;
Create Database DBVenta_Autos_Repuesto_Chapin;
Use DBVenta_Autos_Repuesto_Chapin;

Create table Proveedores(
	idProveedores int auto_increment not null,
	nombreProveedor Varchar(45),
    repuesto Varchar(45),
    telefono Varchar(45),
Primary key PK_IdProveedores (idProveedores)    
);

Create table Clientes(
	codCliente int not null,
    NIT Varchar(45) not null,
    apellidos Varchar(150),
    nombres Varchar(150),
    direccion Varchar(150),
    telefono Varchar(45),
Primary key PK_codCliente (codCliente)
);

Create Table TipoEmpleado(
	colegiado int not null,
    especialidad Varchar(150),
Primary Key PK_colegiado (colegiado)
);

Create table Repuestos(
	idRepuestos int auto_increment not null,
    nombre Varchar(45),
    stock Varchar(45),
    precio Double(10,2),
    idProveedores int not null,
Primary key PK_idRepuestos (idRepuestos),
Constraint FK_repuestos_proveedores Foreign key (idProveedores) References Proveedores (idProveedores)
);

Create Table Empleados(
	idEmpleados int not null,
    DNI Varchar(45),
    nombres Varchar(45),
    apellidos Varchar(45),
    direccion Varchar(45),
    telefono Varchar(45),
	tipoEmpleado int not null,
    idReparaciones Varchar(45),
primary key PK_idEmpleados (idEmpleados),
Constraint FK_Empleados_TipoEmpleado Foreign key (TipoEmpleado) References TipoEmpleado (Colegiado)
);

Create Table Vehiculos(
	idVehiculos int auto_increment not null,
    matricula Varchar(45) not null,
    marca Varchar(45),
    modelo Varchar(45),
    color Varchar(45),
    codCliente int not null,
Primary key PK_IdVehiculo (idVehiculos),
Constraint FK_Vehiculo_Clientes Foreign key (CodCliente) References Clientes (codCliente)
);

Create Table Factura(
	idFactura int auto_increment not null,
    fechaFactura Varchar(45),
    codCliente int not null,
    id Varchar(45),
Primary key PK_idFactura (idFactura),
Constraint FK_Factura_Clientes Foreign key (codCliente) References Clientes (codCliente)
);

Create Table Reparaciones(
	idReparaciones int auto_increment not null,
    idFactura int not null,
    fechaEntrega Date,
    km Varchar(45),
    fechaSalida Date,
    observaciones Varchar(45),
    estado int,
    idEmpleados int not null,
Primary key PK_idReparaciones (idReparaciones),
Constraint FK_Reparaciones_Factura Foreign key (idFactura) References Factura (idFactura),
Constraint FK_Reparaciones_Empleados Foreign key (idEmpleados) References Empleados (idEmpleados)
);

Create Table DetalleFactura(
	idDetalleFactura int auto_increment not null,
    especificación Varchar(45),
    idFactura int not null,
    idRespuestos int not null,
Primary key PK_IdDetalleFactura (idDetalleFactura),
Constraint FK_DetalleFactura_Factura Foreign key (idFactura) References Factura (idFactura),
Constraint FK_DetalleFactura_Repuestos Foreign key (idRespuestos) References Repuestos (idRepuestos)
);

Insert into Proveedores(nombreProveedor, repuesto, telefono)
	Values ("Hola", "Pastillas", "12345678");
    
Insert into Clientes(codCliente, NIT, apellidos, nombres, direccion, telefono)
	Values (123, 0099887766554, "Hola", "Buenas", "5ta calle z.1", "12345678");
 
 Insert into TipoEmpleado(Colegiado, Especialidad)
	Values (4455, "Enderezado");
    
Insert into Repuestos(nombre, stock, precio, idProveedores)
	Values ("Bujías","Si","84.60", 1);
    
Insert into Empleados(idEmpleados, DNI, nombres, apellidos, direccion, telefono, tipoEmpleado, idReparaciones)
	Values (001, 9876003456764, "Naruto", "Uzumaki", "no tengo ni idea z.10", 98450482, 4455, "asdf");

Insert into Vehiculos(matricula, marca, modelo, color, codCliente)
	Values ("P489CFG", "Nissan", "Skyline","Azul", 123 );

Insert into Factura(fechaFactura, codCliente, id)
	Values ("10-01-2022", 123, "No se");
    
Insert into Reparaciones(idFactura, fechaEntrega, km, fechaSalida, observaciones, estado, idEmpleados)
	Values (1, "2022-08-12", 10000, "2022-08-20", "Hacerle mantenimiento pronto", 00, 001);
    
Insert into DetalleFactura(especificación, idFactura, idRespuestos)
	Values ("no se", 1, 1);
    









































