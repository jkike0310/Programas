program ultimo_caracter;
uses crt;
var
palabra, result:string;

function picar (palabra:string):string;
var
i:integer;
pal:string;
begin
i:=1;
pal:='';
while (palabra[i]<>' ')do
begin
pal:=pal+palabra[i];
i:=i+1;
end;
picar:=pal;
end;
procedure buscar (var result:string;palabra:string);
var
l:integer;
caracter:string;
begin
caracter:=picar (palabra);
l:=length (caracter);
result:=caracter[1];
end;

begin
writeln('introduzca un texto');
readln(palabra);
buscar(result,palabra);
writeln('el resultado es ',result);
readln;
end.