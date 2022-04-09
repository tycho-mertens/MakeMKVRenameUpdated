package CustomFingerprintDB;

import tycho.core.client.CustomFingerprintDB.DB;
import tycho.core.client.CustomFingerprintDB.DBFolder;
import tycho.core.client.CustomFingerprintDB.DBJsonFile;
import tycho.core.client.fingerprint.Fingerprint;
import tycho.core.misc.FileManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class DBTests {

    Fingerprint f1 = Fingerprint.fromJson("{\"duration\":2576.11,\"fingerprint\":[346405810,1420147634,1425390002,1417066947,3612786115,3596002753,3595993921,3604906993,3604972513,3604862945,3604338163,3621113319,3579108583,3579108455,4095046707,4095172883,4095172917,4099236149,4099240245,4116010773,4116176709,3578187719,3578253255,3578781639,3587168215,4123915639,4158443895,4158517623,4150124887,4150125399,4284478327,4284077687,4284045159,4284055414,2673442166,2673433718,2675526742,2684077382,3220886862,3220961054,2679764791,2662983461,2667116389,2665018228,2656629748,2656629748,3189339108,3189339108,3210437093,3176886757,3185525237,3168667095,2625510855,2491296198,2487171414,2491243894,2491241782,2516341014,2547872518,2543674142,2543711038,2543710574,2543637887,2514273407,2505884797,2501760253,2501899484,2539582556,2539648476,3613382140,3613389820,3609125836,3609117580,3613377420,4150121389,4152162221,4160548271,4127059454,4127170014,4127178190,4051498190,4046251470,4046287326,4046418926,4046337006,4092531438,4088338022,4088206166,4054659910,3517722899,3589021731,3580638323,3581752435,3615325506,3623320898,3604434770,3734458194,3740751734,3757406006,3748946230,3715391798,3696584566,2362847062,2362915670,2362776406,2362718518,2362718518,2379495734,2379562294,2379682070,2375422230,2375430422,2377412903,2377441637,2376892836,2380563844,2405795732,3475081108,3475218308,3476198788,2400361868,2366811644,2635115884,2639313213,2681318207,2681383483,2683485722,2675085838,3211887134,4285584175,4283552555,4245930283,4245930281,4245869608,4010998840,4015192088,4015106072,4010846232,3977295880,3960847624,3826746888,3833496184,3829060312,2755293945,2774147755,2807767722,2790793902,2792894894,2818060462,2813857966,3046907050,3046906010,3046529166,3046566094,3084052495,2538841359,2675089679,2683494415,3757305911,3746787367,3675459637,3641836829,4178713908,4191296300,4191361596,4191164956,4174445068,4178636316,4178817564,4211126860,4211126991,3925901998,3925910190,3930192814,4005820846,4005820590,4269988013,4135737516,4139926668,4139929740,4131741848,4065685752,4065816600,4067700776,3542352936,3492227371,3559275034,3572374026,3568175642,3567716890,3567273546,2644558538,2413872078,2398339470,2396160399,2412814821,3481576928,2642910580,2680658224,2656418080,2654780704,2654569504,2654635028,2654642180,3191529476,3208303380,3156922900,3169485404,3165225564,2897786488,2767761001,2759371370,2755443562,2755430634,2804911354,2737755274,3777392778,3778424974,3761648014,3761643950,3764795310,3785821094,3819248054,3803126214,4071581702,4138560518,4142720006,4134335510,3594338326,3615113238,3584704534,3567911026,3702129906,3702064562,3706199987,3571986083,3698862755,3715705505,3747576469,4284349060,4149521284,4157910484,4140940788,4141323732,4132934980,4061433973,4061426919,1645487271,1645484206,1662920878,1627269549,1622018733,1621756573,3769371277,3769433807,4041510415,4028927759,3777276958,2703535118,3823480095,3823611709,3798445629,2737304116,2703639140,2687369956,2687108004,2691170476,2691174552,3773314200,3790223560,1940797512,1940793608,1907190281,296544826,279756042,275547146,271368202,271446042,271508702,808346814,825157527,871285381,850313857,1923449475,1923388039,1927328486,1914748518,1646324262,1663166766,1646454910,1646454911,1650619615,1659302093,1927726541,1928759045,1928308007,1928133927,1919732787,1932325906,1898902578,1882092562,1886260546,879103938,887491458,816257746,815995442,832584483,635447651,622865751,540108119,540209398,542359990,549512118,549515942,549504678,545296102,549538790,542195670,856698183,842014983,842146599,854725415,848709415,849137415,867744518,817412358,821934342,813611270,813350150,809141574,823689574,856224102,572010791,572077349,574303268,578366500,602606596,564792580,564799236,563749380,814228020,814244397,281592365,273204861,319414005,302643877,306801060,316225700,314181764,313138309,313425029,296645831,284091399,275701765,271446324,271360292,270311724,269263208,273449961,273451946,332253866,311089834,311077802,847948202,1921751194,1926926474,1920639115,1915462024,1915396860,1932173868,4079661629,4029399607,4029422118,4029426210,2955753762,2964195362,2427062387,2427063425,2427072640,2443780480,2192060880,2196308064,2196332576,2196267040,2196267040,2171135013,2423840047,3491469599,3491342687,3507027325,3507013597,3523969929,3528102795,4132103051,1985729961,1981414571,1981410474,2002300314,1960423242,1694144010,1681823242,1680772618,3827679002,3845434682,3878988858,3864370234,3863446874,3859121019,2785379049,2803270392,2769715944,2687951596,2692015724,2699349740,2716126684,2716653724,2716661940,2741926068,2741927092,2741915092,2741913556,2707838500,2716169765,2711905846,2711908118,2750184758,2817284390,2792245286,2926446646,2926189574,2867473414,2863275014,2863275094,3131718870,3152624838,3094031574,3089767638,3630833110,3639230326,3634970486,1487417110,1487415055,1487414028,1235865932,1265340764,1260949880,1495827432,1495839720,1496950712,2017045240,2017180312,2033891976,2033892232,1601878472,1610147272,3757621707,3623449562,3615110138,3522835434,3503961066,3499754922,3499773338,3499849867,3516430473,1398308088,1377311976,1377449336,1377444104,1377706764,324936253,290263855,273433390,273470774,273457430,1363968278,1405911382,1405977046,1406113206,1405984182,1372561334,1371979703,1371979703,3511070711,3511068119,3511068119,3611733463,3611733495,3588079063,3588001239,3579678149,3613324741,3611222471,3611222487,3749143015,3749144039,3757539301,3755429873,3746631633,3746594775,3713033591,3721487735,3700938103,2629227895,2629170550,2633295222,2622811510,2618616950,2619204850,3160339570,3026097490,3034219891,3034154339,3034092833,3050874145,3069940752,3195728897,3190445057,3190428931,3190429558,3190429286,3202954982,3202946790,3216717526,3216522950,2684120903,2684124485,2650791285,2516575604,2516510020,2516545988,2491236756,3564978612,3562869156,3562353060,3562354084,3561439124,3561438100,1413884884,1413970704,3581794577,3597452561,3605574416,3605635840,3605693184,3597304576,3597309200,2506792240,2516164064,2509823457,2493109671,2511921574,2516111782,2549924334,3078477310,3078477182,3074293087,3072326991,3072322831,4145999119,4078852111,4080994318,4047181870,1903828014,1912282414,1912280382,1905856991,1909993868,1900553116,1397236396,1393039020,3540537012,3527986836,3532164756,3532176884,3533220981,2477435910,2477435958,2444078118,2439810086,2418904166,2419051766,3492682902,3492691334,3496882055,3496287877,4049864372,3509920428,3509920477,3610534415,1467279118,1442114574,1436874783,1420163133,1420163101,1961266493,1952879917,4235625260,4245066732,3976438749,4009862989,3942690565,3925912885,3925973271,3926129942,3926011174,3943835110,3948024742,3956409254,3954378151,4289795511,4287643057,1586505857,1581263233,1577085315,1577253827,1590885890,1452465666,3333527299,3332420913,3353390128,2238098432,2221329408,2221328128,2229785120,2494034464,2493862436,2493805157,2493802215,2632219046,2623801518,2619607214,2636449982,3711047886,3711071246,3711066126,3715293455,2113008431,1573954351,1573955390,3653281142,4181761494,4181826774,3678641302,3745693142,3712155126,3712417766,3713425270,2640273222,2640305414,2640305430,3042956599,3084747829,3080557844,3080565300,3046941220,3046941220,3160199732,3155968532,3155952180,3158054447,3157003054,3156936750,3177850894,4293531662,4205464586,4206608394,4206461002,4206407755,4210598105,4198015208,4198015145,4198216889,4214944939,4282021291,4248450986,4234809018,3165347514,3165281979,3031062171,3048064649,3052717965,3077890541,3061309677,3061239933,3061313599,3078485309,3043878188,3044015404,2960038188,2959858204,2977496604,2977486364,3008926236,2740695580,2740630077,2723725863,2790844198,2801323046,2813971494,2779708438,2783863822,3039699982,3040743438,3040477310,3208249582,3204059374,3199874235,3199876505,3199740296,3199740296,2674420616,2620050313,2620313225,2620315275,3161363083,3036460987,3025972715,3042747759,2774377501,2759501077,2759492404,2758443572,2687496757,2688316003,2705094370,2736535266,2719944610,2724138146,2732002486,2996247734,2998220983,2998680724,2997625996,2997629132,3010449608,4050620504,4050555192,3766402360,3766335768,3762071816,3762071817,3761551627,1612160011,1612088330,3759570954,3826708522,3845579882,3849733226,3858171114,2910130398,2910134734,2908824510,3991077550,3987145390,4104585910,4104204950,4105249413,3568312964,3568316356,3572517316,3291531716,3289426380,3339889101,3591547215,3593647118,1446150158,1443921982,1980792878,4140867630,4135690286,4152599662,4290897263,4244897134,3171126894,3154284158,3041037838,2776872526,2810226254,2814420686,2786373615,2786430957,2787020268,2793310700,2800651548,2817305868,2775377164,2754536716,2755585805,2755553079,2755597927,2776434407,2814117805,2813595564,2712932276,2695962516,2691701636,2685410180,2685479556,2685545092,2698129015,4052885298,4055045394,4053795842,4037018626,2426404882,2426490898,2427638034,3520254738,3527603958,4127453078,4127443334,3594619022,3603208350,4135643327,4131450043,4127515851,4112437322,4097474875,3832186169,3836390716,3836258620,3970476348,2900928828,2938736412,2922021644,2922021452,2922287812,2922361573,2934945383,2947386982,2914814758,2914822407,2910627863,2906434613,2906559509,2771304725,3845046589,3845017901,3844948845,3849126831,3991734207,3991740350,3974963094,3970383254,3970383254,3987680646,3988663694,2914921870,2915003854,4022299982,4022103878,4294764359,4286375767,4286575445,4286563197,4253008765,4252877693,4252886909,3179275645,3179248989,4286389599,4286397727,4284300607,4278140223,4210966303,3669956359,1522079494,1593382199,1593332775,1601756193,1551481889,2096806912,2096807232,1576703360,1568247936,1463333043,1463349410,1461285026,4112135330,4095352226,4107930274,4105898722,4106042066,4104940099,3568070209,3580388929,3609868144,3727307585,1584005953,1592656241,1605113056,1571563744,1554262240,1559505136,1280583872,1293151616,1325593024,1313063365,1321255175,1317069110,1318301998,1586673454,1610006062,1597410858,1446808090,1446816267,2120002057,2119998408,2119076233,4280208569,4112122041,3575525563,3558736042,3562406378,3587572522,3582202666,2508194586,2491418378,2224188170,2224187707,2358663467,2362788155,2354334555,2371666441,2398941705,2394862089,2394587688,2397626920,2389241133,2385037349,2318981222,2316990534,2400857542,2367301062,2245670338,2226787746,2226722210,2159563937,2159594912,2159581056,2163778176,2153353872,2149290644,2151396052,2418652708,2418588453,2422778150,2447936550],\"tmdbId\":\"123456\",\"season\":1,\"episode\":1}");
    Fingerprint f2 = Fingerprint.fromJson("{\"duration\":2574.88,\"fingerprint\":[1116775081,1387307753,1386258733,1386258476,1390720044,3530329132,3526215741,1345206351,1345206734,1344682894,1348864702,1356991166,1356859102,1407197774,1113596702,1113596222,1126379562,1097208106,1088815386,11354379,11305736,1084789528,1084792600,1357417240,3492383496,3492776648,1345239688,1345302152,1345102472,1883030152,1903624858,1903563434,1902518698,1902470378,2003102762,1986316314,1718061066,778414090,778414090,640066586,774287370,1042727114,1043742874,1041629354,1040588970,1023680682,876881850,885338810,881275642,882250298,279253514,279196170,1352955402,1357175322,1357232922,1353038650,1369213946,1401786250,1389331850,1389146507,1918664856,1914605736,1914085608,1930862888,1880531228,1883169540,1882120980,1949246244,1953313575,1953235238,2096039726,2112753438,2062424590,2057968206,1522211534,1522024142,1536960206,433858522,417079803,416088443,415633787,415633707,415642431,406922015,407053071,407052575,406926639,432043375,432076159,432125263,465812943,1531092429,1514315212,1514380700,4206992828,4206933676,3670061736,2596385432,2588127944,2596722376,2596691560,2596740904,2598118444,2583429164,2562523164,2562658317,2562666509,2564649071,2287784047,2333920367,2317211775,2321463374,2598287438,2665392206,2656864494,2639571182,2622930058,2623456394,2489237662,2489106606,2491183278,2487050678,2490262423,2507032240,2515521184,2548947616,3085753264,3068983744,3060590016,2519720000,2469318708,3610145060,4130214692,4134276644,4134283812,4134283813,4268567078,4268694070,4268301878,4268245774,4294689038,4287266831,2106307340,2110296596,2097718820,2097735268,2098783972,2098806436,2098739622,2136479906,2146961570,2126059746,2126190834,2126134466,3753534658,3717875075,3566958208,3569903268,3301451428,3301467812,3565709036,3565743852,3565744108,2493033452,2514009004,2539162537,2518519449,2451015305,2449970829,2466354893,2432812621,2416166781,2488368935,2496687398,2494659878,2493666642,2493699394,2498150594,2515435602,3061547062,3061548054,3060500486,3060316166,2787682334,3995641903,3996776495,4013585708,3980005944,3963224600,3967418984,3967357672,3992454632,4021816504,4021815496,1874593993,1874593866,1841182762,1828596266,1950230058,1950233146,1950225034,1899967114,557326990,561532815,568904092,564709788,565041565,816839071,1907817870,1902310862,1898112318,1931503406,1394634542,1944119855,1940240957,1638251324,1638251836,3786325036,3790519340,3780871661,3775432333,3808988815,3808988814,3792539294,3859651326,3859733294,3994744878,4008340527,3936953373,3936952351,3941212175,3924434958,3900317722,3900314666,4177202683,4177206009,3099286264,4173028088,4172860056,4255696520,4276642696,3732431240,3732541625,3606720682,3606720682,3598320810,3611102394,3577547162,3560836746,1417551498,1421698762,1421666010,1421648634,3569133563,3564941801,3581850604,3577647676,3559698956,3693978124,3698254348,3564072477,3564051247,3559856494,3576498414,3593013422,1449788606,1459241102,1455079879,1454952711,368632097,1413013793,1412080931,1344992562,1344984322,1365953794,309201090,309266562,309266818,317655475,314392480,865870496,1910252196,1901949580,1931338460,1899800173,1898744359,1936501254,1936697862,1936718358,1945032214,1940836406,1471070246,3585004582,3586122774,3590317062,3577586950,3560736038,3560473381,3562702100,3587869956,3583674628,3722045732,3745016100,3744999204,3711578628,3447337476,1308230196,1287459366,1287399206,1287403814,1283201126,1279002870,1278101702,1277856902,1294700934,1323864966,1319670454,1319744183,1324069799,3471359399,3488131493,3724060837,2650515637,2648350085,2681913733,2530853813,2532950948,2533090212,2533056932,2532909476,2654482596,2654744740,2671517940,3695059293,3703448154,3568185898,3567540778,3567573546,3697576730,3743714058,3727132938,3728124170,4264992777,2050994184,2048819256,2048913449,4196229161,4196274475,4183426858,4175048234,4170848970,4170914442,4170800026,4170767771,3649607051,3653805449,3628639641,3624580524,2550839277,2551903031,2619011350,2625336086,2625312550,2625242662,2633641506,2646294258,2646286290,2679857042,2679689111,2682834837,2682834324,2657660340,2653533620,2519446964,2519380372,2524624068,3061824724,3212634277,3078416549,3074414829,3074348525,3073262533,3077456453,3085591109,3051889197,3052147501,2490107695,2490252603,2490252058,2515483422,2544793870,2528079118,2527982606,2532103231,2519515183,3593257023,3610173519,3593396559,3593918287,3596021327,3612728158,4149541758,4116511102,4108107642,4099792443,4099527193,4097405512,4095234776,4101526504,4126675176,4143460584,4143514840,4135263385,4118444189,4116637853,4041141183,4041140879,1895681679,4034712207,4047360655,4064203423,4063646463,4062577535,4066645286,4075037742,4091817006,4054203423,3517330703,3500553483,3504739595,3505783867,3523167273,3518809145,3516703753,3516704009,3516704568,2443021864,2446297640,2471463656,2467270376,2450495228,2450453244,2517558012,2521220092,2547368237,2509565999,2492523558,2498784294,2489347126,3575737430,3581041862,3581019542,1431700390,1564811958,1560617862,1543906254,1426465230,1427510554,391384378,399771915,396126475,396229579,396143307,1469884297,1469887371,1469612987,1457226155,1464766890,1427083754,1411220858,1417579562,1350495278,4041665854,4041655582,4117139487,4150755455,4151677021,4130727245,4130794767,4130778895,4132888126,4158113326,4124885290,4110176522,4109905930,4100591658,4234813481,4235924268,4235728412,3696827928,3578337816,3574274700,1394285196,1383734156,1392119692,1386807692,1386746782,1386820542,1386946990,1391993006,1379410158,1345064990,271461642,271477514,275642890,283966074,276102122,810875882,810339834,865060299,864739592,865771788,838508860,825926948,825795876,892904740,876127508,1679533332,1679465748,1629133140,3780742132,3780677364,3789391540,3789521564,4108161693,3034362590,3026052718,3028085286,3027036454,3027028006,3035626518,3081433094,3064619078,4143587526,4135198925,4263186605,4130930856,4135259369,4135258617,4149942731,4116265931,4124830411,4124814026,4122521290,4121473754,4121473786,4155028346,4150833962,4147749163,4114538537,4114530360,3844071468,3780922408,3789388072,3822025272,3813628440,3796831832,3796566776,4060611320,4077396984,4027064696,3494379640,3502836764,3498641757,3498777286,2156534662,2156648870,2174287014,2260386950,2397757574,2389352582,2389352646,2389370182,2390355750,2386062886,2402821670,2369336870,3430568790,3438936515,3434755969,3434621856,1291332512,1278741424,1329204096,1446665600,1445647488,1449840832,1458147329,1453892642,1453892646,1449700390,1445502270,4230724894,4234854206,4234846014,4240357167,4238115693,4238132060,4242338252,4233983832,4248731256,4282268264,3191745256,3191745273,3210488795,4292617610,3721146506,3721138314,3704357086,3701145695,3433693503,1152004415,1156194605,3295374637,1412032829,1413085213,1413200973,1564124232,1597997256,1580040520,439206681,1512379963,1512517162,1512450858,1517169962,1521296682,1537749002,1504182346,1269301450,1252725178,1253712299,1272524203,1230514603,1226533307,1226431883,1228456330,1262006666,1244172762,1274786106,1270522155,1270522153,1237049640,162037544,141048360,153684520,187304504,187304712,153755400,153633035,208191962,149455290,145274282,1220061098,1236838314,1251583914,1251651998,1251652046,1253765391,1252684093,1323827500,1315444012,1294604572,3425319692,3358202632,3363461897,3371879177,3369651561,1217985837,1220077356,1220272668,1220207124,1220174388,1290756644,1278493413,1141916069,1191330991,369256590,369223822,369158286,373356686,390183055,339981711,339968397,272859644,1422111036,1153544508,1167565116,1201055516,1186376460,3468077580,3484916253,3455572527,3438600038,2365374958,2230092014,2230092270,2541650431,2519642957,2519115596,2523311620,2523310852,2531572516,2515836772,2507462381,2501179102,2501370782,2534863806,2522272174,3059728614,3078471782,3028041750,3036508230,3036569926,3036046687,3027525100,3025406444,3042253724,3058109340,3193768636,3202174716,3202143992,3202151129,3203981915,2667111195,2667094826,3204165930,3204158762,3195637038,3057225007,3074268989,3040843548,3024015884,3023499789,3027681805,3036436269,3034330155,3051103275,3084727403,3084715243,2505900265,2489124089,2484933817,2489138569,2497523338,2224893578,2227164878,2227017438,2225907454,2230093366,2272232758,2250945558,2250940535,2250940485,2519392452,2519384260,2519352724,2537287589,2507795117,2499406508,3032087276,3032014537,2493048523,2497243098,2497311210,2491052526,2491052206,2491044006,2499494054,2432417966,2448147951,2448018908,2506681292,2506680900,2485901828,2485870132,2485786148,2486122021,2490119479,2498049062,2497905702,2498905106,2515727362,3612595202,3595948291,3326452033,3326517572,3326538180,3328065860,3340633412,3308979532,3292073964,3296215023,3300409327,3298312170,3298571738,3300865226,2243917006,2280506382,2255324174,2255455502,2255397151,2255135007,2255135037,2280239916,2246804188,2231030412,2222617229,2149074607,2149058222,2149058478,2167936430,2206153866,3270388874,3266211211,3266276745,3266078121,3270271401,3261915369,3257192555,3525673323,3542974779,3509027099,3492127499,1348839177,1354206489,1956024120,1960237880,1951820344,2085956121,2098543113,2132745755,2115704362,2115703150,2119766254,2138620094,2113454238,2096664734,2091425975,1558752676,1558887412,1424669684,1961556628,4118473348,4135247492,4068098692,4076487300,4075405983,4066952174,4066955630,4150815790,4117260330,4117325838,3580524606,3588904974,3588885518,3588947978,3589996830,3315213103,3298435645,3432657468,3434623548,3438813740,3438831144,3438865176,3438975004,2365233197,2221574367,2217384078,2217446790,2150138262,3240853894,3546977175,3530203829,3530203808,2456527520,2993201824,3056116448,3056116256,3056116257,3056121123,3072908327,3043817527,3043776565,3043908613,3043894277,3085836559,3081634079,2543653022,2542547134,2509780138,2513968298,2497184939,2421686715,2421961609,3495760584,3495887368,3495768584,3512477208,3581685288,3614189865,3614210089,3580643387,3563898890,3572024330,3437805834,3437875482,3433689370,3299529082,3303723498,3320505258,3329945498,3325749646,3325737358,3325725838,3329982602,3606872283,3534520571,3535323627,3556440043,3514461097,3493424025,3493427641,3497621945,1350260153,1358676379,1884930191,1883029654,1881972966,1881972962,1881973219,1898963697,1915667009,1915634177,1919566337,1927954961,1923630885,4071124013,4054345771,4037736459,1957357578,1978267674,1969870874,1969937434,1999564810,2000678987,2000437321,1897677033,1879900648],\"tmdbId\":\"37680\",\"season\":2,\"episode\":7}");
    Fingerprint f3 = Fingerprint.fromJson("{\"duration\":2574.88,\"fingerprint\":[1116775081,1387307753,1386258733,1386258476,1390720044,3530329132,3526215741,1345206351,1345206734,1344682894,1348864702,1356991166,1356859102,1407197774,1113596702,1113596222,1126379562,1097208106,1088815386,11354379,11305736,1084789528,1084792600,1357417240,3492383496,3492776648,1345239688,1345302152,1345102472,1883030152,1903624858,1903563434,1902518698,1902470378,2003102762,1986316314,1718061066,778414090,778414090,640066586,774287370,1042727114,1043742874,1041629354,1040588970,1023680682,876881850,885338810,881275642,882250298,279253514,279196170,1352955402,1357175322,1357232922,1353038650,1369213946,1401786250,1389331850,1389146507,1918664856,1914605736,1914085608,1930862888,1880531228,1883169540,1882120980,1949246244,1953313575,1953235238,2096039726,2112753438,2062424590,2057968206,1522211534,1522024142,1536960206,433858522,417079803,416088443,415633787,415633707,415642431,406922015,407053071,407052575,406926639,432043375,432076159,432125263,465812943,1531092429,1514315212,1514380700,4206992828,4206933676,3670061736,2596385432,2588127944,2596722376,2596691560,2596740904,2598118444,2583429164,2562523164,2562658317,2562666509,2564649071,2287784047,2333920367,2317211775,2321463374,2598287438,2665392206,2656864494,2639571182,2622930058,2623456394,2489237662,2489106606,2491183278,2487050678,2490262423,2507032240,2515521184,2548947616,3085753264,3068983744,3060590016,2519720000,2469318708,3610145060,4130214692,4134276644,4134283812,4134283813,4268567078,4268694070,4268301878,4268245774,4294689038,4287266831,2106307340,2110296596,2097718820,2097735268,2098783972,2098806436,2098739622,2136479906,2146961570,2126059746,2126190834,2126134466,3753534658,3717875075,3566958208,3569903268,3301451428,3301467812,3565709036,3565743852,3565744108,2493033452,2514009004,2539162537,2518519449,2451015305,2449970829,2466354893,2432812621,2416166781,2488368935,2496687398,2494659878,2493666642,2493699394,2498150594,2515435602,3061547062,3061548054,3060500486,3060316166,2787682334,3995641903,3996776495,4013585708,3980005944,3963224600,3967418984,3967357672,3992454632,4021816504,4021815496,1874593993,1874593866,1841182762,1828596266,1950230058,1950233146,1950225034,1899967114,557326990,561532815,568904092,564709788,565041565,816839071,1907817870,1902310862,1898112318,1931503406,1394634542,1944119855,1940240957,1638251324,1638251836,3786325036,3790519340,3780871661,3775432333,3808988815,3808988814,3792539294,3859651326,3859733294,3994744878,4008340527,3936953373,3936952351,3941212175,3924434958,3900317722,3900314666,4177202683,4177206009,3099286264,4173028088,4172860056,4255696520,4276642696,3732431240,3732541625,3606720682,3606720682,3598320810,3611102394,3577547162,3560836746,1417551498,1421698762,1421666010,1421648634,3569133563,3564941801,3581850604,3577647676,3559698956,3693978124,3698254348,3564072477,3564051247,3559856494,3576498414,3593013422,1449788606,1459241102,1455079879,1454952711,368632097,1413013793,1412080931,1344992562,1344984322,1365953794,309201090,309266562,309266818,317655475,314392480,865870496,1910252196,1901949580,1931338460,1899800173,1898744359,1936501254,1936697862,1936718358,1945032214,1940836406,1471070246,3585004582,3586122774,3590317062,3577586950,3560736038,3560473381,3562702100,3587869956,3583674628,3722045732,3745016100,3744999204,3711578628,3447337476,1308230196,1287459366,1287399206,1287403814,1283201126,1279002870,1278101702,1277856902,1294700934,1323864966,1319670454,1319744183,1324069799,3471359399,3488131493,3724060837,2650515637,2648350085,2681913733,2530853813,2532950948,2533090212,2533056932,2532909476,2654482596,2654744740,2671517940,3695059293,3703448154,3568185898,3567540778,3567573546,3697576730,3743714058,3727132938,3728124170,4264992777,2050994184,2048819256,2048913449,4196229161,4196274475,4183426858,4175048234,4170848970,4170914442,4170800026,4170767771,3649607051,3653805449,3628639641,3624580524,2550839277,2551903031,2619011350,2625336086,2625312550,2625242662,2633641506,2646294258,2646286290,2679857042,2679689111,2682834837,2682834324,2657660340,2653533620,2519446964,2519380372,2524624068,3061824724,3212634277,3078416549,3074414829,3074348525,3073262533,3077456453,3085591109,3051889197,3052147501,2490107695,2490252603,2490252058,2515483422,2544793870,2528079118,2527982606,2532103231,2519515183,3593257023,3610173519,3593396559,3593918287,3596021327,3612728158,4149541758,4116511102,4108107642,4099792443,4099527193,4097405512,4095234776,4101526504,4126675176,4143460584,4143514840,4135263385,4118444189,4116637853,4041141183,4041140879,1895681679,4034712207,4047360655,4064203423,4063646463,4062577535,4066645286,4075037742,4091817006,4054203423,3517330703,3500553483,3504739595,3505783867,3523167273,3518809145,3516703753,3516704009,3516704568,2443021864,2446297640,2471463656,2467270376,2450495228,2450453244,2517558012,2521220092,2547368237,2509565999,2492523558,2498784294,2489347126,3575737430,3581041862,3581019542,1431700390,1564811958,1560617862,1543906254,1426465230,1427510554,391384378,399771915,396126475,396229579,396143307,1469884297,1469887371,1469612987,1457226155,1464766890,1427083754,1411220858,1417579562,1350495278,4041665854,4041655582,4117139487,4150755455,4151677021,4130727245,4130794767,4130778895,4132888126,4158113326,4124885290,4110176522,4109905930,4100591658,4234813481,4235924268,4235728412,3696827928,3578337816,3574274700,1394285196,1383734156,1392119692,1386807692,1386746782,1386820542,1386946990,1391993006,1379410158,1345064990,271461642,271477514,275642890,283966074,276102122,810875882,810339834,865060299,864739592,865771788,838508860,825926948,825795876,892904740,876127508,1679533332,1679465748,1629133140,3780742132,3780677364,3789391540,3789521564,4108161693,3034362590,3026052718,3028085286,3027036454,3027028006,3035626518,3081433094,3064619078,4143587526,4135198925,4263186605,4130930856,4135259369,4135258617,4149942731,4116265931,4124830411,4124814026,4122521290,4121473754,4121473786,4155028346,4150833962,4147749163,4114538537,4114530360,3844071468,3780922408,3789388072,3822025272,3813628440,3796831832,3796566776,4060611320,4077396984,4027064696,3494379640,3502836764,3498641757,3498777286,2156534662,2156648870,2174287014,2260386950,2397757574,2389352582,2389352646,2389370182,2390355750,2386062886,2402821670,2369336870,3430568790,3438936515,3434755969,3434621856,1291332512,1278741424,1329204096,1446665600,1445647488,1449840832,1458147329,1453892642,1453892646,1449700390,1445502270,4230724894,4234854206,4234846014,4240357167,4238115693,4238132060,4242338252,4233983832,4248731256,4282268264,3191745256,3191745273,3210488795,4292617610,3721146506,3721138314,3704357086,3701145695,3433693503,1152004415,1156194605,3295374637,1412032829,1413085213,1413200973,1564124232,1597997256,1580040520,439206681,1512379963,1512517162,1512450858,1517169962,1521296682,1537749002,1504182346,1269301450,1252725178,1253712299,1272524203,1230514603,1226533307,1226431883,1228456330,1262006666,1244172762,1274786106,1270522155,1270522153,1237049640,162037544,141048360,153684520,187304504,187304712,153755400,153633035,208191962,149455290,145274282,1220061098,1236838314,1251583914,1251651998,1251652046,1253765391,1252684093,1323827500,1315444012,1294604572,3425319692,3358202632,3363461897,3371879177,3369651561,1217985837,1220077356,1220272668,1220207124,1220174388,1290756644,1278493413,1141916069,1191330991,369256590,369223822,369158286,373356686,390183055,339981711,339968397,272859644,1422111036,1153544508,1167565116,1201055516,1186376460,3468077580,3484916253,3455572527,3438600038,2365374958,2230092014,2230092270,2541650431,2519642957,2519115596,2523311620,2523310852,2531572516,2515836772,2507462381,2501179102,2501370782,2534863806,2522272174,3059728614,3078471782,3028041750,3036508230,3036569926,3036046687,3027525100,3025406444,3042253724,3058109340,3193768636,3202174716,3202143992,3202151129,3203981915,2667111195,2667094826,3204165930,3204158762,3195637038,3057225007,3074268989,3040843548,3024015884,3023499789,3027681805,3036436269,3034330155,3051103275,3084727403,3084715243,2505900265,2489124089,2484933817,2489138569,2497523338,2224893578,2227164878,2227017438,2225907454,2230093366,2272232758,2250945558,2250940535,2250940485,2519392452,2519384260,2519352724,2537287589,2507795117,2499406508,3032087276,3032014537,2493048523,2497243098,2497311210,2491052526,2491052206,2491044006,2499494054,2432417966,2448147951,2448018908,2506681292,2506680900,2485901828,2485870132,2485786148,2486122021,2490119479,2498049062,2497905702,2498905106,2515727362,3612595202,3595948291,3326452033,3326517572,3326538180,3328065860,3340633412,3308979532,3292073964,3296215023,3300409327,3298312170,3298571738,3300865226,2243917006,2280506382,2255324174,2255455502,2255397151,2255135007,2255135037,2280239916,2246804188,2231030412,2222617229,2149074607,2149058222,2149058478,2167936430,2206153866,3270388874,3266211211,3266276745,3266078121,3270271401,3261915369,3257192555,3525673323,3542974779,3509027099,3492127499,1348839177,1354206489,1956024120,1960237880,1951820344,2085956121,2098543113,2132745755,2115704362,2115703150,2119766254,2138620094,2113454238,2096664734,2091425975,1558752676,1558887412,1424669684,1961556628,4118473348,4135247492,4068098692,4076487300,4075405983,4066952174,4066955630,4150815790,4117260330,4117325838,3580524606,3588904974,3588885518,3588947978,3589996830,3315213103,3298435645,3432657468,3434623548,3438813740,3438831144,3438865176,3438975004,2365233197,2221574367,2217384078,2217446790,2150138262,3240853894,3546977175,3530203829,3530203808,2456527520,2993201824,3056116448,3056116256,3056116257,3056121123,3072908327,3043817527,3043776565,3043908613,3043894277,3085836559,3081634079,2543653022,2542547134,2509780138,2513968298,2497184939,2421686715,2421961609,3495760584,3495887368,3495768584,3512477208,3581685288,3614189865,3614210089,3580643387,3563898890,3572024330,3437805834,3437875482,3433689370,3299529082,3303723498,3320505258,3329945498,3325749646,3325737358,3325725838,3329982602,3606872283,3534520571,3535323627,3556440043,3514461097,3493424025,3493427641,3497621945,1350260153,1358676379,1884930191,1883029654,1881972966,1881972962,1881973219,1898963697,1915667009,1915634177,1919566337,1927954961,1923630885,4071124013,4054345771,4037736459,1957357578,1978267674,1969870874,1969937434,1999564810,2000678987,2000437321,1897677033,1879900648],\"tmdbId\":\"987654\",\"season\":2,\"episode\":7}");

    private DB db;
    @Before
    public void setup(){
        FileManager fM = FileManager.getInstance();
        File dbFile = fM.createTempDirectory();

        db = DB.getInstance();

        addFingerprints();
    }

    public void addFingerprints(){
        db.addFingerprint(f1);
        db.addFingerprint(f2);
        db.addFingerprint(f3);
    }

    @Test
    public void searchTest(){
        DBFolder folder = db.byTMdbId(37680);
        DBJsonFile jsonFile = folder.bySeasonEpisode(2,7);

        assertEquals(jsonFile.getSeason(), 2);
        assertEquals(jsonFile.getEpisode(), 7);
        assertEquals(jsonFile.getFingerprint().getTmdbId(), 37680);
    }

    @After
    public void cleanup(){
        FileManager.getInstance().clearDefaultTempDirectory();
    }
}