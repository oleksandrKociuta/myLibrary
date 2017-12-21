<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Library:</title>
</head>
<body>
<form action="/add" method="post">
    Create Book-><br>
    Name:<br>
    <input type="text" name="name"><br>
    Type:<br>
    <select name="type">
        <option value="FANTASY">Fantasy</option>
        <option value="DRAMA">Drama</option>
        <option value="DETECTIVE">Detective</option>
        <option value="HORROR">Horror</option>
    </select><br><br>
    <input type="submit" value="Submit">
</form>

<form action="/delete" method="post">
    <br>Delete Book-><br>
    ID:<br>
    <input type="text" name="id"><br>
    <input type="submit" value="Submit">
</form>

<form action="/getAllBooks" method="get">
    <br>Get All Books-><br>
    <input type="submit" value="Submit">
</form>

<form action="/update" method="post">
    <br>Update Book->:<br>
    ID:<br>
    <input type="text" name="id"><br>
    Name:<br>
    <input type="text" name="name"><br>
    Type:<br>
    <select name="type">
        <option value="FANTASY">Fantasy</option>
        <option value="DRAMA">Drama</option>
        <option value="DETECTIVE">Detective</option>
        <option value="HORROR">Horror</option>
    </select><br><br>
    <input type="submit" value="Submit">
</form>

<form action="/getById" method="post">
    <br>Get Book by id->:<br>
    ID:<br>
    <input type="text" name="id"><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>