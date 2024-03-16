package org.example.controller;

import java.util.List;
import org.example.dto.item.ItemDto;
import org.example.dto.item.TypeDto;
import org.example.dto.order.OrderDto;
import org.example.dto.pharmacy.PharmacyDto;
import org.example.dto.user.SpecialityDto;

public class TestObjects {
  public static TypeDto commonType;
  public static TypeDto receiptType;
  public static TypeDto specialType;

  public static TypeDto[] types;
  public static PharmacyDto firstPharmacy;
  public static PharmacyDto secondPharmacy;
  public static OrderDto firstOrder;
  public static OrderDto secondOrder;
  public static OrderDto thirdOrder;
  public static OrderDto[] orders;
  public static PharmacyDto[] pharmacies;
  public static ItemDto[] items;
  public static ItemDto[] itemsFirstOrder;
  public static ItemDto[] itemsSecondOrder;
  public static ItemDto[] itemsThirdOrder;

  public static ItemDto receipt;
  public static ItemDto special;
  public static Integer badRequest;
  public static Integer notFoundCode;
  public static String itemNotFound;
  public static String wrongLoginPassword;
  public static String invalidFio;
  public static String userNotFound;
  public static String notFound;

  static {
    commonType = new TypeDto(1L, "common");
    receiptType = new TypeDto(2L, "receipt");
    specialType = new TypeDto(3L, "special");
    types = new TypeDto[] {commonType, receiptType, specialType};

    SpecialityDto speciality = new SpecialityDto(1L, "терапевт");

    firstPharmacy =
        new PharmacyDto(
            1L,
            "Здоровье",
            "ул. Ленина, 10",
            "Пн-Пт: 9:00-18:00, Сб: 10:00-15:00",
            "+7 (123) 456-7890");
    secondPharmacy =
        new PharmacyDto(2L, "Фармация", "пр. Победы, 25", "Пн-Вс: 8:00-22:00", "+7 (987) 654-3210");
    pharmacies = new PharmacyDto[] {firstPharmacy, secondPharmacy};

    receipt =
        new ItemDto(
            1L,
            "Афобазол Ретард таблетки с пролонг высвобождением покрыт.плен.об. 30 мг 20 шт",
            650.0,
            "Фармстандарт-Лексредства, Россия",
            "https://f003.backblazeb2.com/file/propill/afobazol_20.jpg",
            receiptType,
            null);

    special =
        new ItemDto(
            2L,
            "Артелак Баланс раствор офтальмологический увлажняющий 10 мл 1 шт",
            769.0,
            "Др. Герхард Манн ХФП, Германия",
            "https://f003.backblazeb2.com/file/propill/artelak_balans.jpg",
            specialType,
            speciality);

    items = new ItemDto[]{receipt, special};
    itemsFirstOrder = new ItemDto[]{receipt};
    itemsSecondOrder = new ItemDto[]{special};
    itemsThirdOrder = new ItemDto[]{receipt,special};

    firstOrder =
        new OrderDto(
            1L,
            1L,
            "11-01-2024 00:00",
            "16-01-2024 00:00",
            100500.0,
            List.of(itemsFirstOrder),
            firstPharmacy);

    secondOrder =
        new OrderDto(
            2L,
            1L,
            "07-01-2024 00:00",
            "10-01-2024 00:00",
            333.0,
            List.of(itemsSecondOrder),
            firstPharmacy);

    thirdOrder =
        new OrderDto(
            3L,
            1L,
            "07-01-2022 00:00",
            "10-01-2022 00:00",
            333.0,
            List.of(itemsThirdOrder),
            firstPharmacy);

    orders = new OrderDto[]{firstOrder, secondOrder, thirdOrder};

    badRequest = 400;
    notFoundCode = 404;

    itemNotFound = "ITEM_NOT_FOUND";
    wrongLoginPassword = "WRONG_LOGIN_PASSWORD";
    invalidFio = "INVALID_FIO";
    userNotFound = "USER_NOT_FOUND";
    notFound = "NOT_FOUND";
  }
}
