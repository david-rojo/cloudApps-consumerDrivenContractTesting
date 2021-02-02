import org.springframework.cloud.contract.spec.Contract

Contract.make {
  description "should return a landscape"

  request {
    url "/api/topographicdetails/tokyo"
    method GET()
  }

  response {
    status OK()
    headers {
      contentType applicationJson()
    }
    body (
     [
       id: "Tokyo",
       landscape: "Flat"
     ]
    )
  }
}