package com.anastasija.shirtshop.shirts;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/shirts", produces = MediaType.APPLICATION_JSON_VALUE)
public class ShirtsController {
  @GetMapping
  public List<String> getAll(HttpServletRequest request, HttpServletResponse response){
    List<String> allShirt = new ArrayList<>();
    allShirt.add("Doors");
    allShirt.add("Pink floyd");

    return allShirt;
  }
}
