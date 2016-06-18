Feature: Buscar Items

  Scenario Outline: Buscar Item con disponibilidad en varios datasets
    Given dada la pagina inicial de Wallapop para dataset
    When busca un "<item>"
    Then me sale un pagina de resultados de buscado con el resultado "<item>"

    Examples:
      | item    |
      | macbook |
      | iphone  |



