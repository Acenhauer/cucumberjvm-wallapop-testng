Feature: Buscar Item

  Scenario: Buscar Item con disponibilidad
    Given dada la pagina inicial de Wallapop
    When busca un Apple Trackpad
    Then me sale un pagina de resultados de buscado con el resultado Apple Trackpad



