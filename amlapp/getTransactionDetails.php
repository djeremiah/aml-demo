<?php

$response = array();

require_once("db_connect.php");

$db = new DB_CONNECT();
//get the transaction id thru ajax call
$transactionID=$_POST['transactionID'];
//echo $transactionID;
// $transactionID="1000001";
 $queryToGetDetails="Select * from `transaction` where `transactionid`='$transactionID'";
 //echo $queryToGetDetails;
 $queryResult=mysql_query($queryToGetDetails) or die(mysql_error());
 if (mysql_num_rows($queryResult) > 0) 
{

	$response["transactionDetails"] = array();
	
while ($row = mysql_fetch_array($queryResult)) 
	{
		
        $transactionDetails = array();

		$transactionDetails["transactionid"] = $row["transactionid"];
        $transactionDetails["firstname"] = $row["firstname"];
        $transactionDetails["lastname"] = $row["lastname"];
        $transactionDetails["amount"] = $row["amount"];
        $transactionDetails["transactiontype"] = $row["transactiontype"];
        $transactionDetails["fromlocation"] = $row["fromloc"];
        $transactionDetails["tolocation"] = $row["toloc"];
        $transactionDetails["occupation"] = $row["occupation"];
        array_push($response["transactionDetails"], $transactionDetails);
    }
     $response["success"] = 1;
     echo json_encode($response);
 }
else
{
     $response["success"] = 0;
     echo json_encode($response);
}
?>