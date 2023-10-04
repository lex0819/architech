<?php

include_once('model/db.php');

function listOfContatcs() : array {
	$sql = "SELECT m.cont_id, c.number, c.name, COUNT(m.cont_id) AS count FROM messages m, contacts c WHERE m.cont_id = c.cont_id GROUP BY m.cont_id ORDER BY m.create_dt DESC";
	$query = dbQuery($sql);
	return $query->fetchAll();
}

function messagesOfContatc(int $id) : array {
	$sql = "SELECT * FROM messages JOIN contacts USING(cont_id) WHERE $id = cont_id ORDER BY create_dt ASC";
	$query = dbQuery($sql);
	return $query->fetchAll();
}
