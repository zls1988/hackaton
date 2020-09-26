package ru.itrequest

import java.text.SimpleDateFormat
import java.util.*

data class MockFirePoint(
        val id: Int,
        val point: GeoPoint,
        val reportDay: Date,
        val satelliteTime: Date,
        val satellitePortalTime: Date,
        val reactionTime: Date?,
        val respPerson: Person?,
        val subject: String,
        val region: String,
        val theNearestSettlement: String,
        val destination: Long,
        val azimuth: Int,
        val riskLeve: Int,
        val type: String,
        val classification: Int,
        val pt: GeoPolygon,
        val polygon: GeoPolygon,
        val polygonBurn: GeoPolygon
)

data class GeoPoint(
        val lat: Double,
        val lon: Double,
)

data class Person(
        val name: String,
        val phone: String
)

data class GeoPolygon(
        val type: String,
        val points: Array<GeoPoint>
)

class MockRepository {

    private val store: Map<Int, MockFirePoint> = mapOf(
            2521481 to MockFirePoint(
                    id = 2521481,
                    point = GeoPoint(54.560133455, 76.891950976),
                    reportDay = Date().from("21.09.2020", "dd.MM.yyyy"),
                    satelliteTime = Date().from("21.09.2020 - 12:11:40", "dd.MM.yyyy - hh:mm:ss"),
                    satellitePortalTime = Date().from("21.09.2020 - 13:15", "dd.MM.yyyy - hh:mm"),
                    reactionTime = null,
                    respPerson = null,
                    subject = "Новосибирская область",
                    region = "Чистоозерный",
                    theNearestSettlement = "",
                    destination = 3321,
                    azimuth = 57,
                    riskLeve = 37,
                    type = "неконтролируемый пал (вероятность 75%)",
                    classification = 2,
                    pt = GeoPolygon("point", arrayOf(GeoPoint(54.560133455, 76.891950976))),
                    polygon = GeoPolygon("multiPolygon", arrayOf(
                            GeoPoint(54.55832767, 76.87409782),
                            GeoPoint(54.56721687, 76.87848282),
                            GeoPoint(54.57609718, 76.88286152),
                            GeoPoint(54.57346218, 76.89852275),
                            GeoPoint(54.56457996, 76.89413643),
                            GeoPoint(54.56193924, 76.9098053),
                            GeoPoint(54.55304623, 76.90541267),
                            GeoPoint(54.54416211, 76.90102254),
                            GeoPoint(54.54680664, 76.88536702),
                            GeoPoint(54.54944832, 76.8697134),
                    )),
                    polygonBurn = GeoPolygon("multiPolygon", arrayOf(
                            GeoPoint(54.54944832,76.8697134),
                            GeoPoint(54.55832767,76.87409782),
                            GeoPoint(54.56721687,76.87848282),
                            GeoPoint(54.57609718,76.88286152),
                            GeoPoint(54.57346218,76.89852275),
                            GeoPoint(54.56457996,76.89413643),
                            GeoPoint(54.56193924,76.9098053),
                            GeoPoint(54.55304623,76.90541267),
                            GeoPoint(54.54416211,76.90102254),
                            GeoPoint(54.54680664,76.88536702),
                            GeoPoint(54.54944832,76.8697134)
                    ))

            ),
            2518546 to MockFirePoint(
                    id = 2518546,
                    point = GeoPoint(54.517295365, 76.877281874),
                    reportDay = Date().from("19.09.2020", "dd.MM.yyyy"),
                    satelliteTime = Date().from("19.09.2020 - 14:14:24", "dd.MM.yyyy - hh:mm:ss"),
                    satellitePortalTime = Date().from("19.09.2020 - 14:14:24", "dd.MM.yyyy - hh:mm:ss"),
                    reactionTime = Date().from("26.09.2020 - 01:43:27", "dd.MM.yyyy - hh:mm:ss"),
                    respPerson = Person(
                            name = "Ломиковский Владимир Николаевич",
                            phone = "89231833392"
                    ),
                    subject = "Новосибирская область",
                    region = "Чистоозерный",
                    theNearestSettlement = "",
                    destination = 949,
                    azimuth = 100,
                    riskLeve = 38,
                    type = "неконтролируемый пал (вероятность 78%)",
                    classification = 2,
                    pt = GeoPolygon("point", arrayOf(GeoPoint(54.517295365,76.877281874))),
                    polygon = GeoPolygon("multiPolygon", arrayOf(
                            GeoPoint(54.52225641,76.86195425),
                            GeoPoint(54.52420952,76.89020396),
                            GeoPoint(54.51233432,76.89260813),
                            GeoPoint(54.5103974,76.86435841),
                            GeoPoint(54.52225641,76.86195425)
                    )),
                    polygonBurn = GeoPolygon("multiPolygon", arrayOf(
                            GeoPoint(54.52225641,76.86195425),
                            GeoPoint(54.52420952,76.89020396),
                            GeoPoint(54.51233432,76.89260813),
                            GeoPoint(54.5103974,76.86435841),
                            GeoPoint(54.52225641,76.86195425)
                    ))
            ),
            2523284 to MockFirePoint(
                    id = 2523284,
                    point = GeoPoint(54.4411947, 76.870112271),
                    reportDay = Date().from("22.09.2020", "dd.MM.yyyy"),
                    satelliteTime = Date().from("22.09.2020 - 13:05:14", "dd.MM.yyyy - hh:mm:ss"),
                    satellitePortalTime = Date().from("22.09.2020 - 13:52", "dd.MM.yyyy - hh:mm"),
                    reactionTime = null,
                    respPerson = null,
                    subject = "Новосибирская область",
                    region = "Чистоозерный",
                    theNearestSettlement = "",
                    destination = 7979,
                    azimuth = 164,
                    riskLeve = 17,
                    type = "неконтролируемый пал (вероятность 33%)",
                    classification = 3,
                    pt = GeoPolygon("point", arrayOf(GeoPoint(54.4411947,76.870112271))),
                    polygon = GeoPolygon("multiPolygon", arrayOf(
                            GeoPoint(54.43087564,76.87691016),
                            GeoPoint(76.85445304,54.42605483),
                            GeoPoint(54.428413697,76.852910131),
                            GeoPoint(54.42708574,76.84685601),
                            GeoPoint(54.43742003,76.84008704),
                            GeoPoint(54.438744452,76.846140132),
                            GeoPoint(54.44673934,76.84086719),
                            GeoPoint(54.45153919,76.86334147),
                            GeoPoint(54.443644948,76.868544099),
                            GeoPoint(54.44720665,76.88484105),
                            GeoPoint(54.444704128,76.886477687),
                            GeoPoint(54.44600391,76.89255524),
                            GeoPoint(54.43567833,76.89930813),
                            GeoPoint(54.43087564,76.87691016)
                    )),
                    polygonBurn = GeoPolygon("multiPolygon", arrayOf(
                            GeoPoint(54.425053593,76.93290059),
                            GeoPoint(54.42108979,76.93431336),
                            GeoPoint(54.420069671,76.925764635),
                            GeoPoint(54.416439218,76.926775595),
                            GeoPoint(54.41527748,76.93359566),
                            GeoPoint(54.406833774,76.929435251),
                            GeoPoint(54.40379887,76.93027404),
                            GeoPoint(54.40183143,76.90951445),
                            GeoPoint(54.409164621,76.907483104),
                            GeoPoint(54.40855483,76.90079782),
                            GeoPoint(54.411353219,76.900012653),
                            GeoPoint(54.411434492,76.899535814),
                            GeoPoint(54.41013527,76.88592529),
                            GeoPoint(54.413641603,76.884949864),
                            GeoPoint(54.40972115,76.87284896),
                            GeoPoint(54.42472861,76.85806992),
                            GeoPoint(54.425237143,76.859644042),
                            GeoPoint(54.426829834,76.858063298),
                            GeoPoint(54.42605483,76.85445304),
                            GeoPoint(54.428413697,76.852910131),
                            GeoPoint(54.42708574,76.84685601),
                            GeoPoint(54.431874618,76.84371929),
                            GeoPoint(54.43651702,76.82645852),
                            GeoPoint(54.44913578,76.83660889),
                            GeoPoint(54.46174978,76.8467802),
                            GeoPoint(54.45202706,76.88314375),
                            GeoPoint(54.451858412,76.883773518),
                            GeoPoint(54.45262718,76.88415337),
                            GeoPoint(54.44997501,76.89980698),
                            GeoPoint(54.4588658,76.90421044),
                            GeoPoint(54.458167894,76.908332076),
                            GeoPoint(54.46194572,76.90729236),
                            GeoPoint(54.46388739,76.92811296),
                            GeoPoint(54.454372595,76.93073847),
                            GeoPoint(54.453850189,76.933821501),
                            GeoPoint(54.45551968,76.95183945),
                            GeoPoint(54.44519901,76.95471191),
                            GeoPoint(54.43487453,76.95754051),
                            GeoPoint(54.433504732,76.942609878),
                            GeoPoint(54.43309307,76.9424057),
                            GeoPoint(54.42418671,76.937994),
                            GeoPoint(54.425053593,76.93290059)
                    ))
            ),
            2523283 to MockFirePoint(
                    id = 2523283,
                    point = GeoPoint(54.553516865, 76.84998321),
                    reportDay = Date().from("22.09.2020", "dd.MM.yyyy"),
                    satelliteTime = Date().from("22.09.2020 - 13:05:14", "dd.MM.yyyy - hh:mm:ss"),
                    satellitePortalTime = Date().from("22.09.2020 - 13:52", "dd.MM.yyyy - hh:mm"),
                    reactionTime = null,
                    respPerson = null,
                    subject = "Новосибирская область",
                    region = "Чистоозерный",
                    theNearestSettlement = "",
                    destination = 2618,
                    azimuth = 5,
                    riskLeve = 38,
                    type = "неконтролируемый пал (вероятность 75%)",
                    classification = 3,
                    pt = GeoPolygon("point", arrayOf(GeoPoint(54.553516865,76.84998321))),
                    polygon = GeoPolygon("multiPolygon", arrayOf(
                            GeoPoint(54.5562412,76.83544643),
                            GeoPoint(54.56109636,76.85781769),
                            GeoPoint(54.55079253,76.86451242),
                            GeoPoint(54.54593166,76.84217352),
                            GeoPoint(54.5562412,76.83544643)
                    )),
                    polygonBurn = GeoPolygon("multiPolygon", arrayOf(
                            GeoPoint(54.575284095,76.930222617),
                            GeoPoint(54.57571445,76.9315428),
                            GeoPoint(54.56082787,76.94621905),
                            GeoPoint(54.546417092,76.90213685),
                            GeoPoint(54.54416211,76.90102254),
                            GeoPoint(54.544806242,76.897209302),
                            GeoPoint(54.54200237,76.88863233),
                            GeoPoint(54.52303765,76.8307557),
                            GeoPoint(54.525615122,76.828192515),
                            GeoPoint(54.52519864,76.82694091),
                            GeoPoint(54.54012805,76.81208192),
                            GeoPoint(54.54838756,76.83697384),
                            GeoPoint(54.54883881,76.83528767),
                            GeoPoint(54.552268051,76.838038954),
                            GeoPoint(54.5562412,76.83544643),
                            GeoPoint(54.557246728,76.840079629),
                            GeoPoint(54.56455134,76.84106643),
                            GeoPoint(54.563972613,76.852032507),
                            GeoPoint(54.56689623,76.85436388),
                            GeoPoint(54.563115141,76.868280401),
                            GeoPoint(54.562796251,76.874322921),
                            GeoPoint(54.57016296,76.8722468),
                            GeoPoint(54.570921095,76.880309298),
                            GeoPoint(54.57609718,76.88286152),
                            GeoPoint(54.57346218,76.89852275),
                            GeoPoint(54.567874321,76.895763289),
                            GeoPoint(54.5783027,76.92726645),
                            GeoPoint(54.575284095,76.930222617)
                    ))
            )
    )

    fun getAll() = store.values

    fun getById(id: Int) = store[id]

}

fun Date.from(string: String, format: String): Date =
        SimpleDateFormat(format).parse(string)